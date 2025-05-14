package org.nak;

import java.util.logging.Logger;

public class Timer {
    private int currentTime;
    private final int endTime;
    private boolean dayRunning = true;
    private final Logger log = Log.getInstance();

    public Timer() {
        this.currentTime = 0;
        this.endTime = 28800; // 8 hours in seconds
    }

    public boolean dayRunning() {
        return dayRunning;
    }

    public void timeTick(int time) {
        currentTime += time;
        if (currentTime > endTime) {
            dayRunning = false;
        }
        log.info("Current time: " + currentTime);
    }

    public int getCurrentTime() {
        return currentTime;
    }
}
