package lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = createRandomList(5, 10);
        System.out.println("nums = " + nums);
        System.out.println("minArr(nums) = " + minArr(nums));
        System.out.println("maxArr(nums) = " + maxArr(nums));
        System.out.println("avgArr(nums) = " + avgArr(nums));
    }

    /**
     * @param n   size of array
     * @param max maximum number in range
     * @return array of integer numbers
     * @apiNote Create a random array of integer numbers in range [0;max) size of n.
     */
    public static ArrayList<Integer> createRandomList(int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            list.add(rand.nextInt(max));
        return list;
    }

    /**
     * @param nums Input array
     * @return Minimum
     * @apiNote Minimum number of array
     */
    private static int minArr(ArrayList<Integer> nums) {
        Integer min = nums.get(0);
        for (Integer num : nums)
            if (num < min)
                min = num;
        return min;
    }

    /**
     * @param nums Input array
     * @return Maximum
     * @apiNote Maximum number of array
     */
    private static int maxArr(ArrayList<Integer> nums) {
        Integer max = nums.get(0);
        for (Integer num : nums)
            if (num > max)
                max = num;
        return max;
    }

    /**
     * @param nums Input array
     * @return Average
     * @apiNote Average number of array
     */
    private static double avgArr(ArrayList<Integer> nums) {
        int avg = 0;
        for (Integer num : nums)
            avg += num;
        return (double) avg / nums.size();
    }
}
