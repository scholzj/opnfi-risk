package com.opnfi.risk.auth;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.Handler;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.auth.AuthProvider;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.RoutingContext;

import static io.netty.handler.codec.http.HttpHeaderNames.ORIGIN;

public class JsonLoginHandler implements Handler<RoutingContext> {

    private static final Logger LOG = LoggerFactory.getLogger(JsonLoginHandler.class);
    private final AuthProvider authProvider;

    public static JsonLoginHandler create(AuthProvider authProvider) {
        return new JsonLoginHandler(authProvider);
    }

    private JsonLoginHandler(AuthProvider authProvider) {
        this.authProvider = authProvider;
    }

    @Override
    public void handle(RoutingContext context) {
        try {
            JsonObject record = context.getBodyAsJson();
            String username = record.getString("username");
            String password = record.getString("password");
            if (username == null || password == null) {
                LOG.warn("No username or password provided in login request");
                context.fail(HttpResponseStatus.BAD_REQUEST.code());
            } else {
                JsonObject authInfo = new JsonObject().put("username", username).put("password", password);
                authProvider.authenticate(authInfo, res -> {
                    if (res.succeeded()) {
                        User user = res.result();

                        JsonObject resp = new JsonObject().put("username", user.principal().getString("username"));

                        context.setUser(user);
                        context.response()
                            .putHeader("content-type", "application/json; charset=utf-8")
                            .end(Json.encodePrettily(resp));
                        LOG.info("User {} authenticated successfully", username);
                    } else {
                        context.fail(HttpResponseStatus.FORBIDDEN.code());
                        LOG.warn("User {} failed to authenticate!", username);
                    }
                });
            }
        } catch (DecodeException e) {
            context.fail(HttpResponseStatus.BAD_REQUEST.code());
        }
    }
}
