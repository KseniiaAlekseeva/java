package lesson2.ClassWork;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] res = runningSum(arr);
        for (int item : res) {
            System.out.print(item + " ");
        }
    }

    /**
     * @param arr Input array
     * @return Output array
     * @apiNote Returns the running sum of array elements
     */
    private static int[] runningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            arr[i] += arr[i - 1];
        return arr;
    }
}
