package lesson6.ClassWork;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
        System.out.println("percentUniq(list) = " + percentUniq(list));
    }

    /**
     * @param list Входящий список
     * @return Процент уникальных значений
     * @apiNote Дан массив чисел. Определить процент уникальных чисел
     */
    private static double percentUniq(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
//        for (Integer item : list)
//            set.add(item);
        return set.size() * 100 / list.size();
    }
}
