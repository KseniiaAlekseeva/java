package lesson2.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("isIncreasing =" + isIncreasing(n, sc));
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param n Количество чисел последовательности
     * @param sc Сканер
     * @return True - если последовательность возрастающая.
     */
    private static boolean isIncreasing(int n, Scanner sc) {
        int num;
        int prevnum = sc.nextInt();
        for (int i = 1; i < n; i++) {
            num = sc.nextInt();
            if (num <= prevnum)
                return false;
            prevnum = num;
        }
        return true;
    }
}
