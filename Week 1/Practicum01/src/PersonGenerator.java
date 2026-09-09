import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();

        boolean done = false;
        while (!done) {
            String id = SafeInput.getNonZeroLenString(in, "Enter ID");
            String first = SafeInput.getNonZeroLenString(in,"Enter First Name");
            String last = SafeInput.getNonZeroLenString(in,"Enter Last Name");
            String title = SafeInput.getNonZeroLenString(in,"Enter Title");
            int yob = SafeInput.getInt(in,"Enter Year of Birth");

            String record = String.format("%s, %s, %s, %s, %d", id, first, last, title, yob);
            people.add(record);

            done = !SafeInput.getYNConfirm(in,"Add another person?");
        }

        String fileName = SafeInput.getNonZeroLenString(in,"Enter file name to save (e.g., PersonTestData.txt)");

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(fileName))) {
            for (String p : people) {
                writer.write(p);
                writer.newLine();
            }
            System.out.println("File saved: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
