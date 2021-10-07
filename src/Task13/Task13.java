package Task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task13 {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String string = scanner.nextLine();
        checkString(string);
    }

    public static void checkString(String string) {
        String[] arrString = string.split(" "); // разделяем строку
        int count = 0;
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].matches("[^а-яА-Я0-9]+")){  // регулярное выражение от Аа-Яя и 0 - 9
                System.out.println(arrString[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
