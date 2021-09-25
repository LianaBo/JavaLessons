package Task6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        LengthConverter lengthConverter = new LengthConverter();
//        WeightConverter weightConverter = new WeightConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int converterMode = scanner.nextInt(); // режим конвертации
        switch (converterMode) {
            case 1:
                // weightConverter.weight();
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int converterUnit = scanner.nextInt(); // единица конвертации
                if (1 <= converterUnit & converterUnit <= 4) {
                    System.out.println("Введите число");
                    double valueUnit = scanner.nextDouble(); // значение единицы конвертации
                    lengthConverter.length(converterUnit, valueUnit);
                } else System.out.println("Данной единицы измерения нет в списке");
                break;
            default:
                System.out.println("Данного режима конвертации нет в списке");
        }
    }
}

class LengthConverter {
    public static String length(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 1:
                LengthConverter.convertToMeter(converterUnit, valueUnit);
                break;
            case 2:
                LengthConverter.convertToMile(converterUnit, valueUnit);
                break;
            case 3:
                LengthConverter.convertToYard(converterUnit, valueUnit);
                break;
            case 4:
                LengthConverter.convertToFoot(converterUnit, valueUnit);
                break;
        }
        return "Вы выбрали еденицу измерения : 2 - расстояние";
    }

    public static double convertToMeter(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 1:
                System.out.println("Метры: " + valueUnit);
            case 2:
                double meterToMile = valueUnit * 0.0006;
                System.out.println("Мили: " + String.format("%.3f", meterToMile));
            case 3:
                double meterToYard = valueUnit * 1.094;
                System.out.println("Ядра: " + String.format("%.2f", meterToYard));
            case 4:
                double meterToFoot = valueUnit * 3.281;
                System.out.println("Футы: " + String.format("%.2f", meterToFoot));
        }
        return valueUnit;
    }

    public static double convertToMile(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 2:
                System.out.println("Мили: " + valueUnit);
            case 3:
                double mileToYard = valueUnit * 1824;
                System.out.println("Ярды: " + String.format("%.2f", mileToYard));
            case 4:
                double mileToFoot = valueUnit * 5469;
                System.out.println("Футы: " + String.format("%.2f", mileToFoot));
            case 1:
                double mileToMeter = valueUnit * 1667.34;
                System.out.println("Метры: " + String.format("%.2f", mileToMeter));
        }
        return valueUnit;
    }

    public static double convertToYard(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 3:
                System.out.println("Ярды: " + valueUnit);
            case 2:
                System.out.println("Мили: " + valueUnit * 0.000568182);
            case 1:
                System.out.println("Метры: " + valueUnit * 0.9144);
            case 4:
                System.out.println("Футы: " + valueUnit * 3);
        }
        return valueUnit;
    }

    public static double convertToFoot(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 4:
                System.out.println("Футы: " + valueUnit);
            case 3:
                System.out.println("Ярды: " + valueUnit * 0.333333);
            case 2:
                System.out.println("Мили: " + valueUnit * 0.000189394);
            case 1:
                System.out.println("Метры: " + valueUnit * 0.3048);
        }
        return valueUnit;
    }
}
