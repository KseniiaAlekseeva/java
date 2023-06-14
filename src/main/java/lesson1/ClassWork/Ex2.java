package lesson1.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int preva = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            if (fromPositiveToNegative(preva, a))
            count++;
            preva = a;
        }
        System.out.println("count = " + count);
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     * @param a Первое число
     * @param b Следующее число
     * @return True - если сначала положительное, потом - отрицательное
     */
    private static boolean fromPositiveToNegative(int a, int b) {
        int i = 0;
        return a > 0 && b < 0;
    }
}
