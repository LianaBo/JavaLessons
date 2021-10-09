package FinalTask1;

import java.util.Scanner;

public class CurrencyConverter {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара: ");
        double currUSD = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        double currRUB = in.nextDouble();
        printConvertRubOfUsd(currUSD, currRUB);
    }

    public static void printConvertRubOfUsd(double currUSD, double currRUB) {
        System.out.println("Итого: " + String.format("%.2f", currRUB / currUSD) + " долларов");
    }
}
