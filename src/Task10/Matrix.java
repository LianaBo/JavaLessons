package Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задайте матрице количество строк");
        int stringMatrix = scanner.nextInt();
        System.out.println("Задайте матрице количество столбцов");
        int columnMatrix = scanner.nextInt();

        if (stringMatrix > 0 & columnMatrix > 0) {
            double[][] matrix = createMatrix(stringMatrix, columnMatrix);
            System.out.println("Заполните матрицу числовыми значениями");
            fillMatrix(matrix); //заполнение матрицы
            multiplyValueMatrix(matrix); // умножение значений первой строки матрицы
        } else {
            System.out.println("Проверьте входные данные. Столбец и строка матрицы должны быть положительными целыми числами");
        }
    }

    public static double[][] createMatrix(int stringMatrix, int columnMatrix) {
        double[][] matrix = new double[stringMatrix][columnMatrix];
        return matrix;
    }

    public static double[][] fillMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                double value = scanner.nextDouble();
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static void multiplyValueMatrix(double[][] matrix) {
        double[] mulArray = new double[matrix[0].length]; // создаем массив по длине равный длине первой строки матрицы
        for (int i = 0; i < matrix[0].length; i++) {
            mulArray[i] = matrix[0][i] * 3;
        }

        System.out.println(Arrays.toString(mulArray));
    }
}
