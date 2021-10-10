package FinalTask2;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите уравнение с одной неизвестной: ");
        String equation = in.next(); // вводим строку и разбиваем ее на элементы массива
        char[] equationArr = equation.toCharArray();
        if (equationArr.length == 5) {
            int positionX = equation.indexOf('x');
            System.out.println(Arrays.toString(equationArr));
            checkArr(positionX, equationArr);
        } else {
            System.out.println("Попробуйте еще раз!");
        }
    }

    public static void checkArr(int positionX, char[] equationArr) {
        switch (positionX) {
            case 0:
                firstPosition(equationArr);
                break;
            case 2:
                middlePosition(equationArr);
                break;
            case 4:
                lastPosition(equationArr);
                break;
        }
    }

    public static void firstPosition(char[] equationArr) {
        int middleInt = Character.digit(equationArr[2], 10);
        int lastInt = Character.digit(equationArr[4], 10);
        if (equationArr[1] == '+') {
            System.out.println("Вывод: " + (lastInt - middleInt));
        } else if (equationArr[1] == '-') {
            System.out.println("Вывод: " + (lastInt + middleInt));
        }
    }

    public static void middlePosition(char[] equationArr) {
        int firstInt = Character.digit(equationArr[0], 10);
        int lastInt = Character.digit(equationArr[4], 10);
        if (equationArr[1] == '+') {
            System.out.println("Вывод: " + (firstInt - lastInt));
        } else if (equationArr[1] == '-') {
            System.out.println("Вывод: " + (firstInt - lastInt));
        }
    }

    public static void lastPosition(char[] equationArr) {
        int firstInt = Character.digit(equationArr[0], 10);
        int middleInt = Character.digit(equationArr[2], 10);

        if (equationArr[1] == '+') {
            System.out.println("Вывод: " + (firstInt + middleInt));
        } else if (equationArr[1] == '-') {
            System.out.println("Вывод: " + (firstInt - middleInt));
        }
    }
}



