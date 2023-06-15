package lesson2.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sumNum = " + sumNumbers(n, sc));
    }

    /**
     * @param n  Количество чисел последовательности
     * @param in Сканер
     * @return Сумма чисел
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     */
    private static int sumNumbers(int n, Scanner in) {
        int sum = 0;
        int num, prevnum = 0;
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            if (i > 0 && num % 10 == 5 && prevnum % 2 == 0)
                sum += num;
            prevnum = num;
        }
        return sum;
    }
}
