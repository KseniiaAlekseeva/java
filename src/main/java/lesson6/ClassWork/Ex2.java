package lesson6.ClassWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 3, 9));
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("interSet(set1,set2) = " + interSet(set1, set2));
    }

    /**
     * @param set1 Первое множество
     * @param set2 Второе множество
     * @return Пересечение множеств
     * @apiNote Найти пересечение двух множеств
     */
    private static HashSet<Integer> interSet(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
}
