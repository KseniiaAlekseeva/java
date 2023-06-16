package lesson2.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num, sum = 0;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (isSimple(num))
                sum += num;
        }
        System.out.println("sum of simple = " + sum);
    }

    /**
     * @param num Целое число
     * @return True - если число простое
     * @apiNote Определяет, является ли число простым.
     */
    private static boolean isSimple(int num) {
        if (num == 1 || num % 2 == 0)
            return num == 2;
        int i = 3;
        while (i * i <= num && num % i != 0)
            i += 2;
        return i * i > num;
    }
}
