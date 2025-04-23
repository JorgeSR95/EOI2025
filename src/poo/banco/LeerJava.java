package poo.banco;

import java.util.Scanner;

public class LeerJava {
    final private static Scanner sc = new Scanner(System.in);

    public LeerJava() {
    }

    public static double getDouble() {
        return sc.nextDouble();
    }

    public static int getInt() {
        return sc.nextInt();
    }

    public static String getString() {
        return sc.nextLine();
    }
}
