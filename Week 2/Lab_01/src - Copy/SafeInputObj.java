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

    // Continue converting your SafeInput methods the same way
}