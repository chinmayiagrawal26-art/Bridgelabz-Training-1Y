package com.gla.threads;
import java.util.*;
class Ticket extends Thread {
    int ticketId;
    String type;
    int priority;
    long waitTime;
    long processingTime;
    Ticket(int id, String type, int priority) {
        this.ticketId = id;
        this.type = type;
        this.priority = priority;
        setPriority(priority);
        setName("Agent-" + id);
    }
    public void run() {
        try {
            long startWait = System.currentTimeMillis();
            System.out.println("Ticket " + ticketId + " (" + type + ") assigned to " + getName() + " | Priority: " + priority + " STARTED");
            int sleepTime = (int)(Math.random() * 4000) + 1000;
            Thread.sleep(sleepTime);
            processingTime = sleepTime;
            waitTime = System.currentTimeMillis() - startWait;
            System.out.println("Ticket " + ticketId + " COMPLETED by "
                    + getName() + " in " + (processingTime/1000.0) + " sec");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class CustomerSupportSystem {
    public static void main(String[] args) throws InterruptedException {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "Critical Bug", 10));
        tickets.add(new Ticket(2, "Feature Request", 4));
        tickets.add(new Ticket(3, "General Query", 2));
        tickets.add(new Ticket(4, "Feedback", 1));
        tickets.add(new Ticket(5, "Critical Bug", 10));
        tickets.add(new Ticket(6, "Feature Request", 4));
        tickets.add(new Ticket(7, "General Query", 2));
        tickets.add(new Ticket(8, "Feedback", 1));
        tickets.add(new Ticket(9, "Critical Bug", 10));
        tickets.add(new Ticket(10, "General Query", 2));
        tickets.sort((a, b) -> b.priority - a.priority);
        System.out.println("---- Ticket Queue (Based on Priority) ----");
        int pos = 1;
        for (Ticket t : tickets) {
            System.out.println("Position " + pos++ + ": Ticket " + t.ticketId +
                    " (" + t.type + ") Priority: " + t.priority);
        }
        long totalStartTime = System.currentTimeMillis();
        for (Ticket t : tickets) {
            t.start();
        }
        for (Ticket t : tickets) {
            t.join();
        }
        long totalTime = System.currentTimeMillis() - totalStartTime;
        Map<Integer, List<Long>> stats = new HashMap<>();
        for (Ticket t : tickets) {
            stats.putIfAbsent(t.priority, new ArrayList<>());
            stats.get(t.priority).add(t.waitTime);
        }
        System.out.println("\n---- Statistics ----");
        for (int p : stats.keySet()) {
            List<Long> times = stats.get(p);
            double avg = times.stream().mapToLong(Long::longValue).average().orElse(0);
            System.out.println("Priority " + p + " Avg Wait Time: " + (avg/1000.0) + " sec");
        }
        System.out.println("\nTotal Processing Time: " + (totalTime/1000.0) + " sec");
    }
}