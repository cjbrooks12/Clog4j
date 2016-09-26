package com.caseyjbrooks.clog4j;

import com.caseyjbrooks.clog.ClogLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.MarkerManager;

public class ClogInfo implements ClogLogger {

    private static final Logger logger = LogManager.getLogger(ClogInfo.class);

    public boolean isActive() {
        return true;
    }

    public int log(String tag, String message) {
        logger.info(MarkerManager.getMarker(tag), message);
        return 0;
    }

    public int log(String tag, String message, Throwable throwable) {
        logger.info(MarkerManager.getMarker(tag), message, throwable);
        return 0;
    }
}
