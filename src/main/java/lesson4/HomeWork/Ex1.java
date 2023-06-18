package lesson4.HomeWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = createRandomList(n);
        System.out.println("list = " + list);
        System.out.println("reverseList1(list) = " + reverseList1(new LinkedList<>(list)));
        System.out.println("reverseList2(list) = " + reverseList2(new LinkedList<>(list)));
        System.out.println("reverseList3(list) = " + reverseList3(new LinkedList<>(list)));
    }

    /**
     * @param list Input list of integers
     * @return Reversed list
     * @apiNote Create the reversed list of integers
     */
    private static LinkedList<Integer> reverseList3(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    /**
     * @param list Input list of integers
     * @return Reversed list
     * @apiNote Create the reversed list of integers
     */
    private static LinkedList<Integer> reverseList2(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>();
        while (!list.isEmpty())
            temp.addFirst(list.pop());
        return temp;
    }

    /**
     * @param list Input list of integers
     * @return Reversed list
     * @apiNote Create the reversed list of integers
     */
    private static LinkedList<Integer> reverseList1(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>();
        while (!list.isEmpty()) {
            temp.add(list.peekLast());
            list.remove(list.size() - 1);
        }
        return temp;
    }

    /**
     * @param n Size of the list
     * @return Random list of integers
     * @apiNote Creates the random list of integers size of n.
     */
    private static LinkedList<Integer> createRandomList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < n; i++)
            list.add(rd.nextInt(10));
        return list;
    }
}
