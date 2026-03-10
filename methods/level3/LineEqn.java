import java.util.Scanner;
public class LineEqn {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double distance;
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
    public static double[] findLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);   
        double b = y1 - m * x1;             
        double result[] = new double[2];
        result[0] = m;
        result[1] = b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1 = sc.nextDouble();
        System.out.println("Enter y1:");
        double y1 = sc.nextDouble();
        System.out.println("Enter x2:");
        double x2 = sc.nextDouble();
        System.out.println("Enter y2:");
        double y2 = sc.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        double line[] = findLine(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
    }
}