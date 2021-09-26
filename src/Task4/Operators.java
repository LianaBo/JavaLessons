package Task4;

import java.util.Scanner;

public class Operators {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        System.out.println("Среднее арифметическое трех чисел: " + avgNumbers(x, y, z));

        double roundingAvg = Math.floor(Operators.avgNumbers(x, y, z) / 2);
        System.out.println(roundingAvg);
        System.out.println((roundingAvg > 3) ? "Программа выполнена корректно" : "Error");
    }

    public static double sumThreeNumbers(double x, double y, double z) {
        return x + y + z;
    }

    public static double avgNumbers(double x, double y, double z) {
        return sumThreeNumbers(x, y, z) / 3;
    }


}