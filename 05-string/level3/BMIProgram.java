import java.util.Scanner;
public class BMIProgram {
public static String[][] calculateBMI(double[][] data) {
    String[][] result = new String[data.length][4];
    for (int i = 0; i < data.length; i++) {
        double weight = data[i][0];
        double heightCm = data[i][1];
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";
        result[i][0] = String.format("%.2f", heightCm);
        result[i][1] = String.format("%.2f", weight);
        result[i][2] = String.format("%.2f", bmi);
        result[i][3] = status;
    }
    return result;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(data);
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t"+result[i][1] + "\t" +result[i][2] + "\t" +result[i][3]);
        }
        sc.close();
    }
}