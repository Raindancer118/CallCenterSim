package org.nak;

public class Call {
    private int duration;
    private final int endSupportLevel;
    private int currentSupportLevel;

    public Call(int endSupportLevel) {
        this.duration = 0;
        this.currentSupportLevel = 0;
        this.endSupportLevel = endSupportLevel;
    }

    public int getDuration() {
        return duration;
    }

    public void addTime(int time) {
        this.duration += time;
    }

    public int getEndSupportLevel() {
        return endSupportLevel;
    }

    public int getCurrentSupportLevel() {
        return currentSupportLevel;
    }

    private void incrementCurrentSupportLevel() {
        if (currentSupportLevel < endSupportLevel) {
            currentSupportLevel++;
        }
    }
}
