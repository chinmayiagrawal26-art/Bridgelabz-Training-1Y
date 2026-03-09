import java.util.Scanner;
class Circle{
    double radius;
    void calculate() {
        double area = 3.14* radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter radius of the circle: ");
        c1.radius = sc.nextDouble();
        c1.calculate();
    }
}