package J_001;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[15];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un valor en el índice " + i + ":");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                contador++;
            }
        }

        System.out.println("El número 3 aparece un total de " + contador + " veces en la lista introducida.");
    }
}
