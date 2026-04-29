import java.io.*;

public class FileCount {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Provide file name");
            return;
        }

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        int chars = 0, words = 0, lines = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            String[] w = line.trim().split("\\s+");
            if (line.trim().length() != 0)
                words += w.length;
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
/*
Characters: 120
Words: 25
Lines: 5
  */
