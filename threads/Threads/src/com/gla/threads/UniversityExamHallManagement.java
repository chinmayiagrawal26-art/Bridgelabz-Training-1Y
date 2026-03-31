package com.gla.threads;
class EntryThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Student Entry in progress... " + i);
                Thread.sleep(1000);
            }
            System.out.println("Student Entry Completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class QuestionPaperThread extends Thread {
    public void run() {
        try {
            Thread.sleep(5000); // starts after 5 sec
            System.out.println("Question Paper Distribution Started.");
            Thread.sleep(2000);
            System.out.println("Question Paper Distribution Completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class AttendanceThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10000); // starts after 10 sec
            System.out.println("Attendance Marking Started.");
            Thread.sleep(2000);
            System.out.println("Attendance Marking Completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class CollectionThread extends Thread {
    public void run() {
        try {
            Thread.sleep(15000); // after exam duration
            System.out.println("Answer Sheet Collection Started.");
            Thread.sleep(2000);
            System.out.println("Answer Sheet Collection Completed.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class ExamHallManagement {
    public static void main(String[] args) {
        EntryThread entry = new EntryThread();
        QuestionPaperThread qp = new QuestionPaperThread();
        AttendanceThread att = new AttendanceThread();
        CollectionThread col = new CollectionThread();
        qp.setPriority(10);
        att.setPriority(8);
        col.setPriority(7);
        entry.setPriority(5);
        System.out.println("Initial States:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("Question Paper: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());
        entry.start();
        qp.start();
        att.start();
        col.start();
        System.out.println("\nStates after starting:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("Question Paper: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());
        try {
            entry.join();
            qp.join();
            att.join();
            col.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\nFinal States:");
        System.out.println("Entry: " + entry.getState());
        System.out.println("Question Paper: " + qp.getState());
        System.out.println("Attendance: " + att.getState());
        System.out.println("Collection: " + col.getState());

        System.out.println("\nAll activities completed successfully.");
    }
}