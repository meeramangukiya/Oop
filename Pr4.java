import java.util.Scanner;

public class pr4 {
    static double bmi(double w, double h) {
        double kg = w * 0.45359237;
        double m = h * 0.0254;
        return kg / (m * m);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter weight (pounds): ");
        double w = s.nextDouble();

        System.out.print("Enter height (inches): ");
        double h = s.nextDouble();

        double result = bmi(w, h);

        System.out.printf("BMI = %.2f", result);
    }
}
/*
Enter weight (pounds): 150
Enter height (inches): 65
BMI = 24.96
*/
