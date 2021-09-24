package Task6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        LengthConverter lengthConverter = new LengthConverter();
//        WeightConverter weightConverter = new WeightConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int converterMode = scanner.nextInt(); // режим конвертации
        if (converterMode == 1) {
            // weightConverter.weight(value);
        } else if (converterMode == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int converterUnit = scanner.nextInt(); // еденица конвертации
            System.out.println("Введите число");
            double valueUnit = scanner.nextDouble(); // значение еденицы преобразования
            lengthConverter.length(converterUnit, valueUnit);
        } else {
            System.out.println("Вы ввели несуществующее значение :((");
        }

    }
}

class LengthConverter {
    public static String length(int converterUnit, double valueUnit) {
        if (converterUnit == 1) {
            LengthConverter.convertToMeter(converterUnit, valueUnit);
        } else if (converterUnit == 2) {
            LengthConverter.convertToMile(converterUnit, valueUnit);
        } else if (converterUnit == 3) {
            LengthConverter.convertToYard(converterUnit, valueUnit);
        } else if (converterUnit == 4) {
            LengthConverter.convertToFoot(converterUnit, valueUnit);
        } else System.out.println("Вы ввели несуществующее значение :(");

        return "что-то";
    }

    public static double convertToMeter(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 1:
                System.out.println("Метры: " + valueUnit);
            case 2:
                System.out.println("Мили: " + valueUnit * 0.0006);
            case 3:
                System.out.println("Ядра: " + valueUnit * 1.0936);
            case 4:
                System.out.println("Футы: " + valueUnit * 3.280);
                break;
            default:
                System.out.println("Вы ввели несуществующее значение :(");
                break;
        }
        return valueUnit;
    }

    public static double convertToMile(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 2:
                System.out.println("Мили: " + valueUnit);
            case 1:
                System.out.println("Метры: " + valueUnit * 1609.34);
            case 3:
                System.out.println("Ярды: " + valueUnit * 1760);
            case 4:
                System.out.println("Футы: " + valueUnit * 5280);
                break;
            default:
                System.out.println("Вы ввели несуществующее значение :(");
                break;
        }
        return valueUnit;
    }

    public static double convertToYard(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 3:
                System.out.println("Ярды: " + valueUnit);
            case 1:
                System.out.println("Метры: " + valueUnit * 0.9144);
            case 2:
                System.out.println("Мили: " + valueUnit * 0.000568182);
            case 4:
                System.out.println("Футы: " + valueUnit * 3);
                break;
            default:
                System.out.println("Вы ввели несуществующее значение :(");
                break;
        }
        return valueUnit;
    }

    public static double convertToFoot(int converterUnit, double valueUnit) {
        switch (converterUnit) {
            case 4:
                System.out.println("Футы: " + valueUnit);
            case 3:
                System.out.println("Ярды: " + valueUnit * 0.333333);
            case 1:
                System.out.println("Метры: " + valueUnit * 0.3048);
            case 2:
                System.out.println("Мили: " + valueUnit * 0.000189394);
                break;
            default:
                System.out.println("Вы ввели несуществующее значение :(");
                break;
        }
        return valueUnit;
    }
}
