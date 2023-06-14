package lesson1.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = reverseString(s);
        System.out.println(s2);
    }

    /**
     * @apiNote Given an input string s, reverse the order of the words.
     * @param s Input string
     * @return Output reversed string
     */
    private static String reverseString(String s) {
        String s1 = (s.replaceAll("\\s+", " ")).trim();
        String[] arr = s1.split(" ");
        String s2 = "";
        for (int i = arr.length - 1; i >= 0; i--)
            s2 += arr[i] + " ";
        s2.trim();
        return s2;
    }
}
