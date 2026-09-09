import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select Person File");

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            Path file = chooser.getSelectedFile().toPath();

            System.out.printf("%-8s %-12s %-12s %-8s %-6s%n",
                    "ID#", "Firstname", "Lastname", "Title", "YOB");
            System.out.println("====================================================");

            try (BufferedReader reader = Files.newBufferedReader(file)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",\\s*");
                    System.out.printf("%-8s %-12s %-12s %-8s %-6s%n",
                            parts[0], parts[1], parts[2], parts[3], parts[4]);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }
}
