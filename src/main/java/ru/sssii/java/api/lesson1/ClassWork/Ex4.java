package ru.sssii.java.api.lesson1.ClassWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("addBinary(s1,s2) = " + addBinary(s1, s2));
    }

    /**
     * @param s1 Первое бинарное число
     * @param s2 Второе бинарное число
     * @return Сумма бинарных чисел
     * @apiNote Даны две бинарные строки. Вычислить их сумму
     */
    private static String addBinary(String s1, String s2) {
        if (s1.length() < s2.length()) {
            addBinary(s2, s1);
        }
        int k = 0;
        int j = s2.length() - 1;
        String res = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == '1')
                k++;
            if (j >= 0 && s2.charAt(j) == '1')
                k++;
            j--;
            res = k % 2 + res;
            k /= 2;
        }
        if (k > 0)
            res = k % 2 + res;
        return res;
    }

}
