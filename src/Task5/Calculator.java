package Task5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        String operator = scanner.next();

        switch (operator) {
            case "/":
                if (b != 0) System.out.println(a / b);
                else System.out.println("На 0 делить нельзя!");
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            default:
                System.out.println("Некоректный оператор");
        }
    }
}
