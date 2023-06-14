package lesson1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("reverseString(s) = " + reverseString(s));
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param s Исходная строка
     * @return Перевернутая строка
     */
    private static String reverseString(String s) {
        String s1= s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        return s2+s1;
    }
}
