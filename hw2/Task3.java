/*
 * Если необходимо, исправьте данный код (задание 2 )
 * 
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[] intArray = new int[9];

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Введите элементы массива: ");

        for (int i = 0; i < 9; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.close();

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
