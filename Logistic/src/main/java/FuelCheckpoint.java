class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    String getType() {
        return "Fuel";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;
        return 10;
    }
}