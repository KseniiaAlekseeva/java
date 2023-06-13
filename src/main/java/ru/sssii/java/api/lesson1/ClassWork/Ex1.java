package ru.sssii.java.api.lesson1.ClassWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("res = "+(zadanie1(n)));
        System.out.println("zadanie1(n) = " + zadanie1(n));
    }

    /**
     * @param n входящее целочисленное число
     * @return результат выполнения задачи
     * @apiNote Заданное число возвращает разность между произведением его цифр и суммой
     */
    private static int zadanie1(int n) { // todo: rename method
        int multi = 1, sum = 0;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
