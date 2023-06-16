package lesson3.ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Item> itemList = createList(n);
        System.out.println("itemList = " + itemList);
        sc.nextLine();
        String searchName = sc.nextLine();
        Integer sumVolume = 0;
        List<String> countryList = new ArrayList<>();
        findItem(itemList, searchName, countryList, sumVolume);

    }

    /**
     * @param itemList    Исходный список товаров
     * @param searchName  Искомы тип товара
     * @param countryList Итоговый список стран, производящих товар данного типа
     * @param sumVolume   Сумма объемов экспорта товаров данного типа
     * @apiNote Найти список стран, производящих товар данного типа и сумму объемов экспортируемого товара данного типа
     */
    private static void findItem(List<Item> itemList, String searchName, List<String> countryList, int sumVolume) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                countryList.add(itemList.get(i).getCountry());
                sumVolume += itemList.get(i).getVolume();
            }
        }
        System.out.println("countryList = " + countryList);
        System.out.println("sumVolume = " + sumVolume);
    }

    private static ArrayList<Item> createList(int n) {
        ArrayList<Item> resList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwe1", "asd1", rand.nextInt(100));
            Item item2 = new Item("qwe2", "asd2", rand.nextInt(100));
            Item item3 = new Item("qwe1", "asd3", rand.nextInt(100));
            Item item4 = new Item("qwe1", "asd4", rand.nextInt(100));
            resList.add(item1);
            resList.add(item2);
            resList.add(item3);
            resList.add(item4);
        }

        return resList;
    }
}
