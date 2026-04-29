package com.gla.in;
    class RouteLinkedList<T extends Checkpoint> {

        private class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;

        void addCheckpoint(T checkpoint) {
            Node newNode = new Node(checkpoint);

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

        boolean removeCheckpoint(String checkpointId) {
            if (head == null) return false;

            if (head.data.checkpointId.equals(checkpointId)) {
                head = head.next;
                return true;
            }

            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.checkpointId.equals(checkpointId)) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        T findCheckpoint(String checkpointId) {
            Node temp = head;

            while (temp != null) {
                if (temp.data.checkpointId.equals(checkpointId)) {
                    return temp.data;
                }
                temp = temp.next;
            }
            return null;
        }

        double computeTotalDistance() {
            double total = 0;
            Node temp = head;

            while (temp != null) {
                total += temp.data.distanceFromLast;
                temp = temp.next;
            }
            return total;
        }

        double computeTotalPenalty() {
            double total = 0;
            Node temp = head;

            while (temp != null) {
                total += temp.data.calculatePenalty();
                temp = temp.next;
            }
            return total;
        }

        void printRoute() {
            Node temp = head;
            int i = 1;

            while (temp != null) {
                Checkpoint c = temp.data;
                System.out.println(i + ". " + c.getType() + " – " + c.locationName +
                        " – " + (c.isDelayed() ? "Delayed" : "On Time") +
                        " – Penalty: " + c.calculatePenalty());
                temp = temp.next;
                i++;
            }
        }

        boolean checkConsistency() {
            boolean hasDelivery = false;
            boolean hasFuel = false;

            Node temp = head;
            while (temp != null) {
                if (temp.data instanceof DeliveryCheckpoint) {
                    hasDelivery = true;
                }
                if (temp.data instanceof FuelCheckpoint) {
                    hasFuel = true;
                }
                temp = temp.next;
            }

            return hasDelivery && hasFuel;
        }
    }

