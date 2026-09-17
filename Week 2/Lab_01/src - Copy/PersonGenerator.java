import java.io.PrintWriter;
import java.util.ArrayList;

public class PersonGenerator {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("John", "Doe", "111", "Mr.", 1990));
        people.add(new Person("Mary", "Smith", "222", "Dr.", 1985));
        people.add(new Person("Alex", "Johnson", "333", "Prof.", 1975));

        try (PrintWriter out = new PrintWriter("PersonData.csv")) {
            for (Person p : people) {
                out.println(p.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Saved " + people.size() + " person records.");
    }
}
