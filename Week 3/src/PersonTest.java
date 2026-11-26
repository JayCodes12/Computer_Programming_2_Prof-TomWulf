import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructor() {

        Person p = new Person(
                "Joshua",
                "Chapman",
                "12345",
                "Mr.",
                2003);

        assertEquals("Joshua", p.getFirstName());
        assertEquals("Chapman", p.getLastName());
        assertEquals("12345", p.getID());
        assertEquals("Mr.", p.getTitle());
        assertEquals(2003, p.getYOB());
    }

    @Test
    public void testFullName() {

        Person p = new Person(
                "Joshua",
                "Chapman",
                "12345",
                "Mr.",
                2003);

        assertEquals(
                "Joshua Chapman",
                p.fullName());
    }

    @Test
    public void testFormalName() {

        Person p = new Person(
                "Joshua",
                "Chapman",
                "12345",
                "Mr.",
                2003);

        assertEquals(
                "Mr. Joshua Chapman",
                p.formalName());
    }

    @Test
    public void testGetAge() {

        Person p = new Person(
                "Joshua",
                "Chapman",
                "12345",
                "Mr.",
                2003);

        assertEquals("22", p.getAge(2025));
    }

    @Test
    public void testToCSV() {

        Person p = new Person(
                "Joshua",
                "Chapman",
                "12345",
                "Mr.",
                2003);

        assertEquals(
                "Joshua,Chapman,12345,Mr.,2003",
                p.toCSV());
    }
}