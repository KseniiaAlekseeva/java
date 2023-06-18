package lesson4.ClassWork;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd=new Random();
        for (int i = 0; i < n; i++)
            list.add(rd.nextInt(10));
        sc.close();
        System.out.println(list);
        System.out.println("list.peek() = " + list.peek());
        System.out.println("list.pop() = " + list.pop());
        list.addFirst(3);
        list.addLast(5);
        System.out.println("list = " + list);
        list.remove(3);
        System.out.println("list = " + list);
        list.remove((Integer) 4);
        System.out.println("list = " + list);
    }

}
