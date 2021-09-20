package Task3;

public class Array {
    public static void main(String[] args) {
        int[] arrInt = {4, 884, 75, 8, 643};

        int firstElement = arrInt[0];
        int lastElement = arrInt[arrInt.length - 1];

        arrInt[0] = lastElement;
        arrInt[arrInt.length - 1] = firstElement;

// Выполняется если длина массива нечетная
        if (arrInt.length % 2 != 0) {
            System.out.println(arrInt[0] + arrInt[(arrInt.length - 1) / 2]);
        }

    }
}
