package lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lesson3.HomeWork.Ex4.createRandomList;

public class Ex5 {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> list = createRandomList(n, 10);
        System.out.println("list = " + list);
        System.out.println("permutations(list) = " + permutations(list));
    }

    /**
     * @param list Input array
     * @return List of arrays with all permutations
     * @apiNote Make all permutations for array
     */
    private static ArrayList<ArrayList<Integer>> permutations(List<Integer> list) {
        int nums = factorial(list.size());
        ArrayList<ArrayList<Integer>> mixArr = new ArrayList<ArrayList<Integer>>(nums);
        int max = list.size() - 1;
        int shift = max;
        int count = nums;
        ArrayList<Integer> tempList = new ArrayList<>(list);
        while (count > 0) {
            Collections.swap(tempList, shift, shift - 1);
            mixArr.add(new ArrayList<>(tempList));
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
        return mixArr;
    }

    /**
     * @param n Natural number
     * @return factorial
     * @apiNote Factorial of natural number
     */
    private static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
