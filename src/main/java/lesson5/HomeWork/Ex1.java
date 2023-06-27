package lesson5.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
        String str = "Россия идет вперед всей планета. Планета? Планета - это не Россия.";
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        findWord(str, word);
        countWords(str);
    }

    private static void countWords(String str) {
        Integer count = 0;
        Map<String, Integer> map = new HashMap<>();

        String[] words = str.replaceAll("\\p{Punct}", "").split("\\s+");

        for (String s : words) {
            String s1 = s.toLowerCase();
            map.putIfAbsent(s1, 0);
            map.put(s1, map.get(s1) + 1);
        }
        System.out.println("map = " + map);
    }

    private static void findWord(String str, String word) {
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent(word, 0);

        String[] words = str.replaceAll("\\p{Punct}", "").split("\\s+");

        for (String s : words) {
            if (word.equals(s.toLowerCase()))
                map.put(word, map.get(word) + 1);
        }
        System.out.println("map = " + map);
    }
}


