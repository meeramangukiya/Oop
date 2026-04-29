import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
/*
Enter a sentence: Java is fun and Java is powerful
Word Frequency:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1
*/
