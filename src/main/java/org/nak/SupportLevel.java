package org.nak;

import java.util.ArrayList;

public class SupportLevel {
    private final int ownLevel;
    private final ArrayList<Worker> workers;

    public SupportLevel(int level) {
        this.ownLevel = level;
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        this.workers.remove(worker);
    }

    public int getLevel() {
        return this.ownLevel;
    }

    public ArrayList<Worker> getWorkers() {
        return this.workers;
    }

    public Worker getFreeWorker() {
        for (Worker worker : workers) {
            if (worker.isFree()) {
                return worker;
            }
        }
        return null;
    }
}
