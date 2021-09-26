package Task9;

import java.util.Arrays;
import java.util.Scanner;

public class AvgOfNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Задайте размер массиву");
        int lengthArray = scanner.nextInt();
        if (lengthArray >= 0) {
            double[] myArray = new double[lengthArray]; // задаем размерность массиву
            System.out.println("Заполните массив числовыми значениями");
            fillArray(myArray); // заполнение массива
            avgOfNumderArray(myArray);
//            multipliedElementOfArray();
        } else {
            System.out.println("Вы задали некорректный размер массива. Размер массива не может быть отрицательным");
        }
    }

    public static double[] fillArray(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            double value = scanner.nextDouble();
            myArray[i] = value;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }

    public static double avgOfNumderArray(double[] myArray) {
        double sumNumber = 0;
        for (double num : myArray){
            sumNumber += num;
        }
        double avgNumder = sumNumber / myArray.length;
        System.out.println("Среднее арифметическое элементов массива: " + avgNumder);
        return avgNumder;
    }

//    private static void multipliedElementOfArray( double[] myArray,avgNumder) {
//        for (int i = 0; i < myArray.length;i++){
//            myArray[i] = myArray[i] * avgNumder;
//        }
//        System.out.println(Arrays.toString(myArray));
//    }
}
