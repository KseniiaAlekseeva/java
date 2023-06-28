package lesson6.ClassWork;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<String> array1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> array2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        intersectWords(array1, array2);
    }

    /**
     * @param array1 Первый список слов
     * @param array2 Второй список слов
     * @apiNote Найти пересечение слов в массивах и указать их общее количество
     */
    private static void intersectWords(List<String> array1, List<String> array2) {
        Set<String> set = new HashSet<>(array1);
        set.retainAll(array2);

        Map<String, Integer> map = new HashMap<>();
        for (String item : array1) {
            if (set.contains(item)) {
                map.putIfAbsent(item, 0);
                map.put(item, map.get(item) + 1);
            }
        }
        for (String item : array2) {
            if (set.contains(item)) {
                map.putIfAbsent(item, 0);
                map.put(item, map.get(item) + 1);
            }
        }

//        System.out.println("map = " + map);
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }

//        for (String s : set) {
//            int count = 0;
//            for (String item : array1) {
//                if (s.equals(item))
//                    count++;
//            }
//            for (String item : array2) {
//                if (s.equals(item))
//                    count++;
//            }
//            System.out.println(s + " = " + count);
//        }
    }
}
