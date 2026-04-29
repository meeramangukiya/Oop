class Employee {
    String name = "Meera";
    String dept = "IT";

    void displayDetails() {
        System.out.println("Employee Name = " + name);
        System.out.println("Department = " + dept);
    }
}

class Manager extends Employee {
    int teamSize = 5;

    @Override
    void displayDetails() {
        System.out.println("Employee Name = " + name);
        System.out.println("Department = " + dept);
        System.out.println("Team Size = " + teamSize);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.displayDetails();

        System.out.println();

        Employee m = new Manager(); // runtime polymorphism
        m.displayDetails();
    }
}
/*
Employee Name = Meera
Department = IT

Employee Name = Meera
Department = IT
Team Size = 5
  */
