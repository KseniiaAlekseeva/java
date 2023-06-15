package lesson2.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        if (palindrom(arr))
            System.out.println("Симметричный");
        else
            System.out.println("Не симметричный");
    }

    /**
     * @param arr Входящий массив
     * @return True - если массив симметричный
     * @apiNote Проверить, является ли массив симметричным
     */
    private static boolean palindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}
