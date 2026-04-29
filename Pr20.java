public class Main {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int result = num / den;

            System.out.println("=== Division Result ===");
            System.out.println("Numerator   : " + num);
            System.out.println("Denominator : " + den);
            System.out.println("Result      : " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter two numbers (numerator and denominator)");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Only integer values are allowed");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }

        catch (Exception e) {
            System.out.println("Error: Unexpected problem occurred");
        }
    }
}
/*
=== Division Result ===
Numerator   : 20
Denominator : 5
Result      : 4
java Main 10 0
Error: Division by zero is not allowed
java Main 10
Error: Please enter two numbers (numerator and denominator)
java Main 10 abc
Error: Only integer values are allowed
  */
