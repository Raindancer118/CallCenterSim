package org.nak;

public class Callmaker {
    private Timer timer;
    public Log log;

    public Callmaker() {
        this.timer = new Timer();
        this.log = new Log();
    }

    public Call makeCall(int endSupportLevel) {
        if (timer.dayRunning()) {
            Call call = new Call(endSupportLevel);
            return call;
        }
        log.warning("Call couldn't be made, day is not running.");
        return null;
    }
}
