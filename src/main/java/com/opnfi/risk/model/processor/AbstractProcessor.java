package com.opnfi.risk.model.processor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AbstractProcessor {
    protected final DateFormat timestampFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
}
