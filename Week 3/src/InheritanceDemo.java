import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker(
                "John", "Smith", "W001",
                "Mr.", 1990, 20.00));

        workers.add(new Worker(
                "Sarah", "Jones", "W002",
                "Ms.", 1988, 22.50));

        workers.add(new Worker(
                "Mike", "Brown", "W003",
                "Mr.", 1995, 18.75));

        workers.add(new SalaryWorker(
                "David", "Wilson", "S001",
                "Mr.", 1980, 0,
                65000));

        workers.add(new SalaryWorker(
                "Emily", "Davis", "S002",
                "Ms.", 1985, 72000,
                75000));

        workers.add(new SalaryWorker(
                "Robert", "Taylor", "S003",
                "Dr.", 1978, 74000,
                90000));

        int[] weeks = {40, 50, 40};

        for (int i = 0; i < weeks.length; i++) {

            System.out.println("======== WEEK " + (i + 1) +
                    " ========");

            for (Worker worker : workers) {

                worker.displayWeeklyPay(weeks[i]);

            }
        }
    }
}
