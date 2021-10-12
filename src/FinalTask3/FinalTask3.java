package FinalTask3;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Какое количество слов вы хотите ввести?");
        int countString = in.nextInt();
        String[][] stringArr = new String[countString][]; //создаем двумерный массив
        fillArray(stringArr);
        checkArray(stringArr);
    }

    public static void fillArray(String[][] stringArr) {
        for (int i = 0; i < stringArr.length; i++) {
            String[] splitStr = in.next().split(""); // вводим слово и дробим его на символы
            stringArr[i] = splitStr; // сохраняем слово в массиве
        }
        System.out.println(Arrays.deepToString(stringArr));
    }

    public static void checkArray(String[][] stringArr) {
        int indexMinMatches = 0;   // индекс строки, в которой содержится минимальное количество совпадений
        int countMinMatches = Integer.MAX_VALUE;
        for (int i = 0; i < stringArr.length; i++) {
            int count = 0;
            for (int j = 0; j < stringArr[i].length; j++) {
                for (int k = j + 1; k < stringArr[i].length; k++) {
                    if (stringArr[i][j].equals(stringArr[i][k])) {
                        count++;
                    }
                }
                if (count == stringArr[i].length - 1) {  // если количество совпадений равняется длине строки, то заканчиваем цикл
                    break;
                }
            }
            if (count < countMinMatches) {
                countMinMatches = count;
                indexMinMatches = i;
            }
        }
        String joinString = String.join("", stringArr[indexMinMatches]);
        System.out.println(joinString);
    }
}