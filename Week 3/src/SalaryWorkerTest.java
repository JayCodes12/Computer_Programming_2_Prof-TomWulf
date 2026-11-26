import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testConstructor() {

        SalaryWorker worker =
                new SalaryWorker(
                        "John",
                        "Smith",
                        "S001",
                        "Mr.",
                        1980,
                        0,
                        65000);

        assertEquals(
                65000,
                worker.getAnnualSalary());
    }

    @Test
    public void testWeeklyPay() {

        SalaryWorker worker =
                new SalaryWorker(
                        "John",
                        "Smith",
                        "S001",
                        "Mr.",
                        1980,
                        0,
                        65000);

        assertEquals(
                1250.0,
                worker.calculateWeeklyPay(40),
                0.01);
    }

    @Test
    public void testWeeklyPayIgnoresHoursWorked() {

        SalaryWorker worker =
                new SalaryWorker(
                        "Roger",
                        "Bacon",
                        "S001",
                        "Mr.",
                        1980,
                        0,
                        65000);

        assertEquals(
                worker.calculateWeeklyPay(40),
                worker.calculateWeeklyPay(60),
                0.01);
    }
}