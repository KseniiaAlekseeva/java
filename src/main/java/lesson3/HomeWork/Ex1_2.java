package lesson3.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        List<Product> prodList = createProducts();
        System.out.println("prodList = " + prodList);
        System.out.println("findMaxPrice(prodList) = " + findMaxPrice(prodList));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of product to find: ");
        Integer sort = sc.nextInt();
        System.out.println("findMinPriceProds(prodList, sort) = " + findMinPriceProds(prodList, sort));
    }

    /**
     * @param prodList Входящий список товаров
     * @param sort     Сорт товаров
     * @return Список наименований товаров с наименьшей ценой
     * @apiNote Получить наименования товаров заданного сорта с наименьшей ценой.
     */
    private static ArrayList<String> findMinPriceProds(List<Product> prodList, Integer sort) {
        Integer minPrice = prodList.get(0).getPrice();
        ArrayList<String> nameList = new ArrayList<>();

        for (Product product : prodList) {
            if (product.getType() == sort && product.getPrice() < minPrice)
                minPrice = product.getPrice();
        }

        for (Product product : prodList) {
            if (product.getPrice() == minPrice)
                nameList.add(product.getName());
        }

        return nameList;
    }

    /**
     * @param prodList Входящий список товаров
     * @return Максимальная цена
     * @apiNote Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     */
    private static Integer findMaxPrice(List<Product> prodList) {
        Integer maxPrice = prodList.get(0).getPrice();
        for (Product product : prodList) {
            if ((product.getType() == 1 || product.getType() == 2) && product.getName().toLowerCase().contains("высший") && product.getPrice() > maxPrice)
                maxPrice = product.getPrice();
        }
        return maxPrice;
    }

    /**
     * @return Список экземпляров объекта типа Product
     * @apiNote Создает список экземпляры объекта типа Product
     */
    private static ArrayList<Product> createProducts() {
        ArrayList<Product> resList = new ArrayList<>();
        resList.add(new Product("Высшее яблоко", 120, 1, "Россия", 500));
        resList.add(new Product("Апельсин высший", 100, 2, "Индия", 1500));
        resList.add(new Product("Спелый высший ананас", 200, 3, "Непал", 2500));
        resList.add(new Product("Спелое высшее яблоко", 80, 2, "Россия", 600));
        resList.add(new Product("Высший ананас", 160, 1, "Россия", 300));
        resList.add(new Product("Апельсин высший", 120, 1, "Россия", 500));
        return resList;
    }

}
