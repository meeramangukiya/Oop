class pr6 {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Default Rectangle Area: " + r1.getArea());
        System.out.println("Default Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("Custom Rectangle Area: " + r2.getArea());
        System.out.println("Custom Rectangle Perimeter: " + r2.getPerimeter());
    }
}
/*
Default Rectangle Area: 1.0
Default Rectangle Perimeter: 4.0
Custom Rectangle Area: 15.0
Custom Rectangle Perimeter: 16.0*/
