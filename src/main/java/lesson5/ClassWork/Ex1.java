package lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        // Посчитать количество вхождений каждого символа в текст.
        Map<Character, Integer> mapChar = new HashMap<>();
        String str = "jhbjfhsbjf dfjnlsjl";
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            mapChar.putIfAbsent(ch, 0);
            mapChar.put(ch, mapChar.get(ch) + 1);

//            if (!mapChar.containsKey(ch))
//                mapChar.put(ch, 1);
//            else
//                mapChar.put(ch, mapChar.get(ch) + 1);
        }
        System.out.println("mapChar = " + mapChar);
        for (Map.Entry<Character, Integer> entity : mapChar.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте " + entity.getValue() + " раз.");
        }
    }
}
