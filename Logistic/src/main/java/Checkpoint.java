abstract class Checkpoint {

    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String name, double dist, int exp, int act) {
        this.checkpointId = id;
        this.locationName = name;
        this.distanceFromLast = dist;
        this.expectedDuration = exp;
        this.actualDuration = act;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract String getType();
    abstract double calculatePenalty();
}