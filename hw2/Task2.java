/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. 
*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print(floatNum());
    }

    static float floatNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Введите дробное число: ");
        float a;
        try {
            a = scanner.nextFloat();
        } catch (Exception e) {
            a = floatNum();
        }
        scanner.close();

        return a;
    }
}
