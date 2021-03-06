#!/bin/bash

WHEREAMI=`dirname "${0}"`
if [ -z "${OPNFI_RISK_ROOT}" ]; then
    export OPNFI_RISK_ROOT=`cd "${WHEREAMI}/../" && pwd`
fi

OPNFI_RISK_LIB=${OPNFI_RISK_ROOT}/lib
OPNFI_RISK_ETC=${OPNFI_RISK_ROOT}/etc
export OPNFI_RISK_LOG=${OPNFI_RISK_ROOT}/log

java -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory \
     -Dlogback.configurationFile=${OPNFI_RISK_ETC}/logback.xml \
     -jar ${OPNFI_RISK_LIB}/risk-1.0-SNAPSHOT-fat.jar -conf ${OPNFI_RISK_ETC}/opnfi-risk.json
