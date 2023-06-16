package lesson2.HomeWork;

import static java.lang.Math.abs;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int sumi = sumiOfTwoDigit(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                arr[i] = sumi;
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * @param arr Входящий массив
     * @return Сумма индексов двузначных элементов массива.
     * @apiNote Дан массив целых чисел. Найти сумму индексов двузначных элементов массива.
     */
    private static int sumiOfTwoDigit(int[] arr) {
        int sumi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (abs(arr[i]) / 10 > 0)
                sumi += i;
        }
        return sumi;
    }
}
