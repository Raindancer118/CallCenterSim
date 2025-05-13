package org.nak;

public class Timer {
    private int startTime;
    private int currentTime;
    private int endTime;
    private boolean dayOver = false;

    public boolean dayRunning() {
        return dayOver;
    }

    public void timeTick(int time) {
        currentTime += time;
        if (currentTime > endTime) {
            dayOver = true;
        }
    }
}
