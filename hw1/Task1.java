
/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        System.out.print("\n Длина строки: " + stringLen(str) + "\n");

        str = "";
        phrase(str);

        str = "s";
        System.out.print("\n Число: " + strToInt(str) + "\n");

    }

    static int stringLen(String str) {

        if (str.isEmpty())
            return -1;

        return str.length();
    }

    static int strToInt(String str) {

        int num = 0;
        num = Integer.parseInt(str);
        return num;
    }

    static String phrase(String str) {

        if (str.length() == 0)
            throw new RuntimeException("Строка должна содержать хотя бы один символ");

        return String.join(" ", str, "&#129300 интересный выбор!");
    }

}
