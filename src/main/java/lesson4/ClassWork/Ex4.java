package lesson4.ClassWork;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex4 {
    public static void main(String[] args) {
        // Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, -4, -2, 2, -6, 9, -10));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++)
//            list.add(sc.nextInt());
        System.out.println("list = " + list);
        System.out.println("removeNegative(list) = " + removeNegative(list));
        System.out.println("removeNegative2(list) = " + removeNegative2(list));

    }

    private static LinkedList<Integer> removeNegative(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    private static LinkedList<Integer> removeNegative2(LinkedList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0)
                list.remove(i);
        }
        return list;
    }
}
