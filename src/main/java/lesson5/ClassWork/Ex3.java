package lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        // Написать перевод из римских цифр в арабские
        System.out.println("transformRome(\"LVIII\") = " + transformRome("LVIII"));
        System.out.println("transformRome(\"MCMXCIV\") = " + transformRome("MCMXCIV"));
    }

    /**
     * @param str Римские цифры
     * @return Арабские цифры
     * @apiNote Написать перевод из римских цифр в арабские
     */
    private static Integer transformRome(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Integer res = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++)
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1)))
                res -= map.get(str.charAt(i));
            else
                res += map.get(str.charAt(i));

        return res;
    }
}
