class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
    }
}