package Task4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double sumValue = (x + y + z) / 3;
        int roundingValue = (int) sumValue / 2;

        System.out.println(sumValue);
        System.out.println((roundingValue > 3) ? "Программа выполнена корректно" : "Error");
    }
}
