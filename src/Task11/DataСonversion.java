package Task11;

import java.util.Scanner;

public class DataСonversion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        String firstNumber = scanner.next();
        double stringToDouble = Double.valueOf(firstNumber);

        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        double intToDouble = Double.valueOf(secondNumber);

        printCompareNumber(stringToDouble, intToDouble);
    }

    public static void printCompareNumber(double stringToDouble, double intToDouble) {
        if (stringToDouble == intToDouble) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
            printMaxNumber(stringToDouble, intToDouble);
            printMinNumber(stringToDouble, intToDouble);
        }
    }

    public static void printMaxNumber(double stringToDouble, double intToDouble) {
        System.out.println("Наибольшее из чисел: " + Math.max(stringToDouble, intToDouble));
    }

    public static void printMinNumber(double stringToDouble, double intToDouble) {
        System.out.println("Наименьшее число: " + Math.min(stringToDouble, intToDouble));
    }
}
