interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else
            return "Second Division";
    }
}

public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        int mark = 50;
        double avg = 65;

        System.out.println("Mark = " + mark);
        System.out.println("Passed = " + r.isPassed(mark));

        System.out.println("Average = " + avg);
        System.out.println("Division = " + r.getDivision(avg));
    }
}
/*
Mark = 50
Passed = true
Average = 65.0
Division = First Division
*/
