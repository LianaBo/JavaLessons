package Task7;

import java.util.Scanner;

public class СreatArray {
    static Scanner scanner = new Scanner(System.in);
    static final double X = 54;
    static final double Y = 23.65;
    static final double Z = -65.59;

    public static void main(String[] args) {
        System.out.println("Задайте размер массиву");
        int lengthArray = scanner.nextInt();
        if (lengthArray >= 0) {
            double[] myArray = new double[lengthArray]; // задаем размерность массиву
            System.out.println("Заполните массив числовыми значениями");
            fillArray(myArray); // заполнение массива
        } else {
            System.out.println("Вы задали некорректный размер массива. Размер массива не может быть отрицательным");
        }
    }

    static double[] fillArray(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            double value = scanner.nextDouble();
            chekArray(value);
            myArray[i] = value;
        }
        return myArray;
    }

    static void chekArray(double value) {
        if (value == X || value == Y || value == Z) {
            System.out.println("Значение " + value + " имеется в константах");
        }
    }
}






