class Volume {

    void calculateVolume(double side) {
        System.out.println("Cube Volume = " + (side * side * side));
    }

    void calculateVolume(double l, double w, double h) {
        System.out.println("Rectangular Cube Volume = " + (l * w * h));
    }

    void calculateVolumeSphere(double r) {
        System.out.println("Sphere Volume = " + (4.0/3 * Math.PI * r * r * r));
    }
}

public class Main {
    public static void main(String[] args) {

        Volume v = new Volume();

        v.calculateVolume(3);            
        v.calculateVolume(2, 3, 4);      
        v.calculateVolumeSphere(2);      
    }
}
/*
Cube Volume = 27.0
Rectangular Cube Volume = 24.0
Sphere Volume = 33.510321638291124
*/
