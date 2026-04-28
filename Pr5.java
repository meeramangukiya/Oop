import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle: " + area);
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
/*
Enter three sides: 3 4 5
Area of triangle: 6.0
Enter three sides: 1 2 3
Invalid triangle
*/
