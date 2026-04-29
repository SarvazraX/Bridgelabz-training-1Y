package com.gla.in;

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "DeliveryCheckpoint";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}
