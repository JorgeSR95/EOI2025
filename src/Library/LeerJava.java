package Library;

import java.util.Scanner;

public class LeerJava {
    private static Scanner sc = new Scanner(System.in);

    public LeerJava() {
    }

    public static String getString() {
        return sc.nextLine();
    }

    public static int getInt() {
        return sc.nextInt();
    }
}
