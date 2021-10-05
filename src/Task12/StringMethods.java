package Task12;

import java.util.Scanner;

public class StringMethods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String massage = scanner.nextLine();
        checkString(massage);
        replaceChar(massage);

    }

    public static void checkString(String massage) {
        boolean contains = massage.contains("Java");
        boolean startsWith = massage.startsWith("I like");
        boolean endsWith = massage.endsWith("!!!");

        if (contains == true && startsWith == true && endsWith == true) {
            System.out.println(massage.toUpperCase());
        }
    }

    public static void replaceChar(String massage) {
        String subString = massage.substring(7, 11);
        System.out.println(subString.replace("a", "o"));
    }
}
