public class Main {
    public static void main(String[] args) {

        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();

        route.addCheckpoint(new DeliveryCheckpoint("C1","Warehouse A",30,60,70));
        route.addCheckpoint(new FuelCheckpoint("C2","Pump 12",20,30,30));
        route.addCheckpoint(new RestCheckpoint("C3","Motel X",10,40,45));
        route.addCheckpoint(new DeliveryCheckpoint("C4","Client Hub",60,80,95));

        System.out.println("Route Summary:");
        route.printRoute();

        double totalDistance = route.computeTotalDistance();
        double totalPenalty = route.computeTotalPenalty();
        double score = totalDistance - totalPenalty;

        System.out.println("\nTotal Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " +
                (route.checkConsistency()
                        ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}