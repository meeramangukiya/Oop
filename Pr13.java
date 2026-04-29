class pr13 {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Triangle Area = " + (0.5 * d1 * d2));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area = " + (d1 * d2));
    }
}

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(4, 5);
        t.area();

        Rectangle r = new Rectangle();
        r.getData(4, 5);
        r.area();
    }
}
/*
Triangle Area = 10.0
Rectangle Area = 20.0
  */
