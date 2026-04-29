class RouteLinkedList<T extends Checkpoint> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 🔹 Add
    void addCheckpoint(T cp) {
        Node newNode = new Node(cp);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 🔹 Remove
    boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(id)) {
            head = head.next;
            return true;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(id)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // 🔹 Find
    T findCheckpoint(String id) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.checkpointId.equals(id)) {
                return temp.data;
            }
            temp = temp.next;
        }

        return null;
    }

    // 🔹 Total Distance
    double computeTotalDistance() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }

        return total;
    }

    // 🔹 Total Penalty
    double computeTotalPenalty() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }

        return total;
    }

    // 🔹 Print Route (FINAL FIXED)
    void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint cp = temp.data;

            String status = cp.isDelayed() ? "Delayed" : "On Time";
            double penalty = cp.calculatePenalty();

            System.out.println(i + ". "
                    + cp.getType() + " – "
                    + cp.locationName + " – "
                    + status + " – Penalty: " + penalty);

            temp = temp.next;
            i++;
        }
    }

    // 🔹 Consistency Check
    boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;

        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) hasDelivery = true;
            if (temp.data.getType().equals("Fuel")) hasFuel = true;
            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }
}