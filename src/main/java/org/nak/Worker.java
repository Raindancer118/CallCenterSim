package org.nak;

public class Worker {
    private boolean isFree;
    private int taskTimeLeft;

    public Worker() {
        this.isFree = true;
        this.taskTimeLeft = 0;
    }

    public boolean isFree() {
        return isFree;
    }

    public void assignTask(int time) {
        this.isFree = false;
        this.taskTimeLeft = time;
    }

    public void completeTask() {
        this.isFree = true;
        this.taskTimeLeft = 0;
    }

    public void work(int time) {
        if (taskTimeLeft > 0) {
            taskTimeLeft -= time;
            if (taskTimeLeft <= 0) {
                completeTask();
            }
        }
    }
}
