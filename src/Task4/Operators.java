package Task4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double averageOfThreeNumbers = mathOperation.arithmeticAverage(x, y, z);
        System.out.println("Среднее арифметическое трех чисел: " + averageOfThreeNumbers);

        int roundingAverage = (int) averageOfThreeNumbers;
        System.out.println((roundingAverage / 2 > 3) ? "Программа выполнена корректно" : "Error");
    }
}

class MathOperation {
    public double sumThreeNumbers(double x, double y, double z) {
        return x + y + z;
    }

    public double arithmeticAverage(double x, double y, double z) {
        return sumThreeNumbers(x, y, z) / 3;
    }

}
