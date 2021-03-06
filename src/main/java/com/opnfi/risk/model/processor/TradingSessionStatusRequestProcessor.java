package com.opnfi.risk.model.processor;

import com.opnfi.risk.model.jaxb.*;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import java.util.UUID;

public class TradingSessionStatusRequestProcessor extends AbstractProcessor implements Processor {
    private final String replyToAddress;

    public TradingSessionStatusRequestProcessor(String replyToAddress)
    {
        this.replyToAddress = replyToAddress;
    }

    private FIXML createRequest()
    {
        ObjectFactory of = new ObjectFactory();
        FIXML request = new FIXML();
        TradingSessionStatusRequestMessageT tssr = new TradingSessionStatusRequestMessageT();
        tssr.setReqID(UUID.randomUUID().toString());
        tssr.setSubReqTyp("0");
        request.setMessage(of.createTrdgSesStatReq(tssr));

        return request;
    }

   @Override
   public void process(Exchange exchange) {
       Message out = exchange.getOut();
       out.setBody(createRequest());
       out.setHeader("JMSReplyTo", replyToAddress);
    }
}
