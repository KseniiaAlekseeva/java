package lesson5.ClassWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        //
        int[] arr = {1, 2, 3, 4, 5, 3};
        System.out.println(isDuble(arr));
    }

    /**
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true), в противном случае (false).
     * @param arr Входящий массив
     * @return true - если есть хотя бы один дубль
     */
    private static boolean isDuble(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 1);
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
                return true;
            }
        }
        return false;
    }
}
