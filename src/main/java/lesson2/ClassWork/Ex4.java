package lesson2.ClassWork;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 4, 9, 3, 4, 2};
        System.out.println("Count = " + countPairs(arr));
    }

    /**
     * @param arr Входящий массив
     * @return Количество пар
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     */
    private static int countPairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] * 2)
                count++;
        }
        return count;
    }
}
