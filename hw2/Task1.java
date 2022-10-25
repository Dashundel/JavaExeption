import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Введите размер массива: ");
        int n = scanner.nextInt();

        String[][] arr = new String[n][5];

        System.out.print("\n Введите элементы массива: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.next();
            }
        }
        scanner.close();

        System.out.print(sum2d(arr));
    }

    static int sum2d(String[][] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = 0;
                try {
                    val = Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Неверное преобразование символьной строки в числовой формат");
                }
                s += val;
            }
        }
        return s;
    }
}