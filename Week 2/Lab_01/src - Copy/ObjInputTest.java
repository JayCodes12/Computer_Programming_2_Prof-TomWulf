import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ObjInputTest {
    public static void main(String[] args) {

        SafeInputObj sio = new SafeInputObj();

        System.out.println("=== SafeInputObj Test Program ===");

        String name = sio.getNonZeroLenString("Enter your name");
        System.out.println("You entered: " + name);

        int age = sio.getInt("Enter your age");
        System.out.println("You entered: " + age);

        double salary = sio.getDouble("Enter your salary");
        System.out.println("You entered: " + salary);

        boolean yesNo = sio.getYNConfirm("Do you want to continue");
        System.out.println("You answered: " + yesNo);

        System.out.println("=== End of SafeInputObj Test ===");
    }
    
}

