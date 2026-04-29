import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        System.out.println("Marks of students:");
        for (int m : marks) {
            System.out.println(m);
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
    }
}
/*
Marks of students:
78
85
92
67
88
Highest marks: 92
Lowest marks: 67

*/
