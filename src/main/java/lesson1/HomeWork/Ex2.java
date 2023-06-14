package lesson1.HomeWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prevnum = num;
        int count = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (fromPosToNeg(prevnum, num))
                count += prevnum;
            prevnum = num;
        }
        System.out.println("count = " + count);
    }

    /**
     * @param prevnum Текущее число
     * @param num     Следующее число
     * @return True - если текущее положительное, следующее - отрицательное.
     * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
     */
    private static boolean fromPosToNeg(int prevnum, int num) {
        return prevnum > 0 && num < 0;
    }
}
