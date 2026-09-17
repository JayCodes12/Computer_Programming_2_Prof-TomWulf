import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonReader {

    public static ArrayList<Person> readFile(String filename) {
        ArrayList<Person> people = new ArrayList<>();

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] fields = line.split(",");

                Person p = new Person(
                        fields[0],
                        fields[1],
                        fields[2],
                        fields[3],
                        Integer.parseInt(fields[4])
                );

                people.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return people;
    }
}
