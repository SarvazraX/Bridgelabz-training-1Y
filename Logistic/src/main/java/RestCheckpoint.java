class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String name, double dist, int exp, int act) {
        super(id, name, dist, exp, act);
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        if (!isDelayed()) return 0;

        int delay = actualDuration - expectedDuration;

        return delay * 0.5;   // ✅ REMOVE >30 CONDITION
    }
}