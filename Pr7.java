import java.util.Scanner;

class pr7{
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = s.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = s.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.readEmployeeData();
        e.displayEmployeeData();
    }
}
/*
Enter employee name: Meera
Enter employee salary: 35000
Employee Name: Meera
Employee Salary: 35000.0*/
