package lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random();
        for (int i = 0; i < n; i++)
            list.add(rd.nextInt(10));
        System.out.println("list = " + list);
        System.out.println("sumEven(list) = " + sumEven(list));
    }

    /**
     * @param list Входящий список
     * @return Сумма четных элементов
     * @apiNote Найти сумму четных элементов списка.
     */
    private static int sumEven(LinkedList<Integer> list) {
        int sum = 0;
        for (Integer item : list) {
            if (item % 2 == 0)
                sum += item;
        }
        return sum;
    }
}
