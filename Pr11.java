 class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName, course;

        void setData(String s, String c) {
            studentName = s;
            course = c;
        }

        void display() {
            System.out.println("College Name = " + collegeName);
            System.out.println("Student Name = " + studentName);
            System.out.println("Course = " + course);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        College c = new College("ABC College");
        College.Admission a = c.new Admission();

        a.setData("Meera", "BE");
        a.display();
    }
}
/*
College Name = ABC College
Student Name = Meera
Course = BE

*/
