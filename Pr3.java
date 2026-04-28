
import java.util.*;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char c = sc.next().toLowerCase().charAt(0);

        String v = "aeiou";

        if (Character.isLetter(c))
            System.out.println("Result: " + (v.contains(c + "") ? "Vowel" : "Consonant"));
        else
            System.out.println("Result: Invalid input");
    }
}
/*
Enter a single letter: A
Result: Vowel
  Enter a single letter: b
Result: Consonant
    */
