import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testConstructor() {

        Worker worker = new Worker(
                "John",
                "Smith",
                "W001",
                "Mr.",
                1990,
                20.0);

        Assertions.assertEquals("John", worker.getFirstName());
        Assertions.assertEquals("Smith", worker.getLastName());
        Assertions.assertEquals("W001", worker.getID());
        Assertions.assertEquals(20.0, worker.getHourlyPayRate());
    }

    @Test
    public void testRegularPay() {

        Worker worker = new Worker(
                "John",
                "Smith",
                "W001",
                "Mr.",
                1990,
                20.0);

        Assertions.assertEquals(800.0, worker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    public void testOvertimePay() {

        Worker worker = new Worker(
                "John",
                "Smith",
                "W001",
                "Mr.",
                1990,
                20.0);

        Assertions.assertEquals(1100.0, worker.calculateWeeklyPay(50), 0.01);
    }
}