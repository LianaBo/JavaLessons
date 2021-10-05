package Task11;

import java.util.Scanner;

public class DataСonversion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        numberToString(firstNumber);

        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();
        numberToInt(secondNumber);
        printCompareNumber(firstNumber, secondNumber);
    }

    public static String numberToString(int firstNumber) {
        String toString = Integer.toString(firstNumber);
        return toString;
    }

    public static int numberToInt(double secondNumber) {
        int toInt = (int) secondNumber;
        return toInt;
    }

    public static void printCompareNumber(int firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
            printMaxNumber(firstNumber, secondNumber);
            printMinNumber(firstNumber, secondNumber);
        }
    }

    public static void printMaxNumber(int firstNumber, double secondNumber) {
        System.out.println("Наибольшее из чисел: " + Math.max(firstNumber, secondNumber));
    }

    public static void printMinNumber(int firstNumber, double secondNumber) {
        double convertTypeMinNumber = Math.min(firstNumber, secondNumber);
        System.out.println("Наименьшее число: " + convertTypeMinNumber);
    }
}
