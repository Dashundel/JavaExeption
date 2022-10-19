/*
3. Реализуйте метод, принимающий в качестве аргументов два 
целочисленных массива, и возвращающий новый массив, каждый элемент которого 
равен частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь 
может увидеть - RuntimeException, т.е. ваше.
 */

import java.util.Scanner;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\n Введите размер массива 1: ");
        int n = iScanner.nextInt();

        System.out.print("\n Введите размер массива 2: ");
        int m = iScanner.nextInt();

        iScanner.close();

        Random random = new Random();

        int[] array1 = new int[n];
        int[] array2 = new int[m];

        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(1, 100);
        }

        for (int i = 0; i < m; i++) {
            array2[i] = random.nextInt(1, 100);
        }

        System.out.println("Исходный массив 1: \n");
        printArray.print(array1);

        System.out.println("Исходный массив 2: \n");
        printArray.print(array2);

        int[] resultArr = composition(array1, array2);

        System.out.println("Результат: \n");
        printArray.print(resultArr);
    }

    static int[] composition(int[] array1, int[] array2) {

        int lenArr1 = array1.length;
        int lenArr2 = array2.length;

        if (lenArr1 != lenArr2)
            throw new RuntimeException("Размер массивов должен быть одинаковым");

        int[] resultArr = new int[lenArr1];

        for (int i = 0; i < lenArr1; i++) {
            resultArr[i] = array1[i] * array2[i];
        }

        return resultArr;
    }

}
