import java.util.Scanner;
class TrigoFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        double[] result = {sin, cos, tan};
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] values = calculateTrigonometricFunctions(angle);
        System.out.println("Sin = " + values[0]);
        System.out.println("Cos = " + values[1]);
        System.out.println("Tan = " + values[2]);
        sc.close();
    }
}