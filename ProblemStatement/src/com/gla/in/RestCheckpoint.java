package com.gla.in;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;

        int delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}
