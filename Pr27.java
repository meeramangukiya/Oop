import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("1 Meera 85\n");
            fw.write("2 Ravi 90\n");
            fw.write("3 Anjali 78\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
/*
1 Meera 85
2 Ravi 90
3 Anjali 78
*/
