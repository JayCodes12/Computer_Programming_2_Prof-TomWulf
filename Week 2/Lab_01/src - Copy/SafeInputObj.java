import java.util.Arrays;
import java.util.Scanner;

public class SafeInputObj {

    private Scanner pipe;

    public SafeInputObj() {
        pipe = new Scanner(System.in);
    }

    public SafeInputObj(Scanner scanner) {
        pipe = scanner;
    }

    public String getNonZeroLenString(String prompt) {
        String ret;
        do {
            System.out.print(prompt + ": ");
            ret = pipe.nextLine();
        } while (ret.isEmpty());
        return ret;
    }

    public int getInt(String prompt) {
        int ret = 0;
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                ret = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                done = true;
            } else {
                pipe.nextLine(); // clear bad input
                System.out.println("Invalid integer. Try again.");
            }
        } while (!done);

        return ret;
    }


    public double getDouble(String prompt) {
        double ret = 0;
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                ret = pipe.nextDouble();
                pipe.nextLine(); // clear buffer
                done = true;
            } else {
                pipe.nextLine(); // clear bad input
                System.out.println("Invalid number. Try again.");
            }
        } while (!done);

        return ret;
    }

    public boolean getYNConfirm(String prompt) {
        String response;
        boolean ret = false;
        boolean done = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();

            if (response.equals("Y")) {
                ret = true;
                done = true;
            } else if (response.equals("N")) {
                ret = false;
                done = true;
            } else {
                System.out.println("Please enter Y or N.");
            }
        } while (!done);

        return ret;
    }

    // Continue converting your SafeInput methods the same way
}