package Tesk14;

import java.util.Arrays;
import java.util.Scanner;

public class RandArr {

    public static void main(String[] args) {
        int[] myArr = new int[15];
        randomFillArr(myArr);
        printMaxAbsValue(printMaxValueArr(myArr), printMinValueArr(myArr));
    }

    public static void randomFillArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (-21 + ((Math.random() * 42)));
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

    public static void printMaxAbsValue(int i, int j) {
        int abs = Math.max(Math.abs(i), Math.abs(j));
        System.out.println(abs);
    }
}
