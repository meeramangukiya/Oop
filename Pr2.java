import java.util.Scanner;

public class pr2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        double f = s.nextDouble();

        double D = a * d - b * c;

        if (D == 0) {
            System.out.println("No unique solution");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;

            double x = Dx / D;
            double y = Dy / D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
