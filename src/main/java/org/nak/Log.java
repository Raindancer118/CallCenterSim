package org.nak;

import java.util.logging.Logger;

public class Log {

    private static final Logger log = Logger.getLogger("Log");

    public Log() {
    }

   public void info(String message) {
        log.info(message);
    }

    public void warning(String message) {
        log.warning(message);
    }

    public void error(String message) {
        log.severe(message);
    }

    public void debug(String message) {
        log.fine(message);
    }

    public void trace(String message) {
        log.finer(message);
    }

    public void fatal(String message) {
        log.severe("FATAL: " + message);
    }

    public static Logger getInstance() {
        return log;
    }
}
