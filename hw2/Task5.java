/*
 * Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, 
 * что пустые строки вводить нельзя.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {

        System.out.print(inPut());
    }

    public static String inPut() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        str = reader.readLine();
        reader.close();

        if (str.equals("")) {
            throw new Exception("Пустые строки вводить нельзя");
        }

        return str;
    }

}
