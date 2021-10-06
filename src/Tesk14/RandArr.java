package Tesk14;

import java.util.Arrays;
import java.util.Scanner;

public class RandArr {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr = new int[15];
        randomFillArr(myArr);
        absValue(printMaxValueArr(myArr), printMinValueArr(myArr));

    }

    public static void randomFillArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (-20 + ((Math.random() * 41)));
        }
        System.out.println(Arrays.toString(myArr));
    }

    public static int printMaxValueArr(int[] myArr) {
        int maxValue = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > maxValue) {
                maxValue = myArr[i];
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }

    public static int printMinValueArr(int[] myArr) {
        int minValue = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] < minValue) {
                minValue = myArr[i];
            }
        }
        System.out.println(minValue);
        return minValue;
    }

    public static void absValue(int i, int j) {
        int abs = Math.max(Math.abs(i), Math.abs(j));
        System.out.println(abs);
    }
}
