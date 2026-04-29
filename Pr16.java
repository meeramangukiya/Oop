interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else
            return "Other Division";
    }
}

public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        System.out.println("Average = 65");
        System.out.println("Division = " + r.getDivision(65));
    }
}
/*
Average = 65
Division = First Division
*/
