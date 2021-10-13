package FinalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите уравнение с одной неизвестной: ");
        String equation = in.next();
        String[] equationArr = equation.split("");// разбиваем строку на элементы массива
        if (equationArr.length == 5) {
            checkArr(equationArr);
        } else {
            System.out.println("Попробуйте еще раз!");
        }
    }

    public static void checkArr(String[] equationArr) {
        int sumBeforeEquality = 0;
        int globalСoefficient = 1;
        int localСoefficient = 1;
        int coefficientX = 1;
        int sum = 0;
        int i = 0;

        while (i < equationArr.length) {
            if (equationArr[i].equals("+") || equationArr[i].equals("-")) {
                if (equationArr[i].equals("-")) {
                    localСoefficient = -1;
                }
            } else if (equationArr[i].equals("x")) {
                coefficientX = localСoefficient;
                globalСoefficient = -1;
            } else if (equationArr[i].equals("=")) {
                localСoefficient = 1;
                sumBeforeEquality = sum * globalСoefficient;
                sum = 0;
            } else {
                sum += Integer.valueOf(equationArr[i]) * localСoefficient;
            }
            i++;
        }
        System.out.println(coefficientX * (sum + sumBeforeEquality));
    }
}



