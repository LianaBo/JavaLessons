package Task6;

import java.util.Scanner;

public class Converter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int converterMode = scanner.nextInt(); // режим конвертации
        switch (converterMode) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - унция, 4 - фунт");
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                break;
            default:
                System.out.println("Данного режима конвертации нет в списке");
        }

        int converterUnit = scanner.nextInt(); // единица конвертации
        if (converterUnit >= 1 & converterUnit <= 4) {
            System.out.println("Введите число");
            double valueUnit = scanner.nextDouble(); // значение единицы конвертации
            if (converterMode == 1) {
                weightConverter(converterUnit, valueUnit);
            } else if (converterMode == 2) {
                lengthConverter(converterUnit, valueUnit);
            }
        } else System.out.println("Данной единицы измерения нет в списке");
    }

    private static void lengthConverter(int converterUnit, double valueUnit) {
        String[] text = {"Метры: ", "Мили: ", "Ярды: ", "Футы: "};
        double[][] coefficients =
                {
                        {1, 0.0006, 1.094, 3.281},
                        {1609.34, 1, 1760, 5280},
                        {0.9144, 0.000568182, 1, 3},
                        {0.3048, 0.000189394, 0.333333, 1}
                };

        for (int i = 0; i < coefficients.length; i++) {
            System.out.println(text[i] + String.format("%.3f", valueUnit * coefficients[converterUnit - 1][i]));
        }
    }

    private static void weightConverter(int converterUnit, double valueUnit) {
        String[] text = {"Килограмы: ", "Грамы: ", "Унции: ", "Фунты: "};
        double[][] coefficients =
                {
                        {1, 1000, 35, 274, 2, 20462},
                        {0.001, 1, 0.035274, 0.00220462},
                        {0.0283495, 28.3495, 1, 0.0625},
                        {0.453592, 453.592, 16, 1}
                };

        for (int i = 0; i < coefficients.length; i++) {
            System.out.println(text[i] + String.format("%.3f", valueUnit * coefficients[converterUnit - 1][i]));
        }

    }
}