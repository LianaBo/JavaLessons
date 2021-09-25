package Task8;

import java.util.Scanner;

public class SumOfNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        int n = scanner.nextInt();
        sumOddNumder(n);
    }

    public static int sumOddNumder(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел с 1 до "+ n + " = " + total);
        return total;
    }
}
