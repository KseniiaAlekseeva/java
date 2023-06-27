package lesson5.HomeWork;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        String text = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Павел Чернов\n" +
                "Иван Юрин\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Иван Юрин\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Павел Чернов\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        LinkedHashMap<String, Integer> duplNamesMap = duplicateNames(text);
        System.out.println("duplNamesMap = " + duplNamesMap);
    }

    private static LinkedHashMap<String, Integer> duplicateNames(String str) {
        HashMap<String, Integer> map = countNames(str);
        ArrayList<Map.Entry<String, Integer>> list = sortByValue(map);
        System.out.println("Sorted ArrayList: ");
        for (Map.Entry<String, Integer> item : list) {
            System.out.println(item);
        }

        LinkedHashMap<String, Integer> linkMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> item : list) {
            if (item.getValue() > 1)
                linkMap.put(item.getKey(), item.getValue());
        }
        return linkMap;
    }

    private static HashMap<String, Integer> countNames(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split("\n");
        for (String s : words) {
            String name = s.substring(0, s.indexOf(" "));
            map.putIfAbsent(name, 0);
            map.put(name, map.get(name) + 1);
        }
        System.out.println("map = " + map);
        return map;
    }

    private static ArrayList<Map.Entry<String, Integer>> sortByValue(Map<String, Integer> map) {
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return list;
    }
}
