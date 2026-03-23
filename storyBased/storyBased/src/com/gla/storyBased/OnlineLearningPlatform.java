package com.gla.storyBased;
class Course {
    int courseId;
    String courseName;
    double price;
    static String platformName = "LearnHub";
    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = toTitleCase(courseName);
        this.price = price;
    }
    String toTitleCase(String name) {
        String[] words = name.toLowerCase().split(" ");
        String result = "";
        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        return result.trim();
    }
    double getFinalPrice() {
        return price;
    }
    void display() {
        System.out.println("Platform: " + platformName);
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Original Price: ₹" + price);
    }
}
class RecordedCourse extends Course {
    RecordedCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }
    @Override
    double getFinalPrice() {
        return price - (price * 0.10); // 10% discount
    }
}
class LiveCourse extends Course {
    LiveCourse(int courseId, String courseName, double price) {
        super(courseId, courseName, price);
    }
    @Override
    double getFinalPrice() {
        return price - (price * 0.05); // 5% discount
    }
}
class LearningPlatform {
    public static void main(String[] args) {
        Course c1 = new RecordedCourse(101, "java programming", 2000);
        Course c2 = new LiveCourse(102, "data structures", 3000);
        c1.display();
        System.out.println("Final Price (Recorded): ₹" + c1.getFinalPrice());
        System.out.println();
        c2.display();
        System.out.println("Final Price (Live): ₹" + c2.getFinalPrice());
    }
}
