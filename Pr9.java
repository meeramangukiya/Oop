class Rectangle {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.area());
        System.out.println("Perimeter = " + r2.perimeter());

        System.out.println();

        if (r1.area() > r2.area())
            System.out.println("Rectangle 1 has larger area");
        else
            System.out.println("Rectangle 2 has larger area");
    }
}
/*
Rectangle 1:
Width = 4.0
Height = 40.0
Area = 160.0
Perimeter = 88.0

Rectangle 2:
Width = 3.5
Height = 35.9
Area = 125.65
Perimeter = 78.8

Rectangle 1 has larger area
*/
