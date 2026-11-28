import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();

        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();

            Filter filter = new ShortWordFilter();

            try {
                Scanner input = new Scanner(file);

                System.out.println("Words shorter than 5 characters:");

                while (input.hasNext()) {

                    String word = input.next();

                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }

                input.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            }
        }
    }
}