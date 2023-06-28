package lesson6.HomeWork;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Notebook> nb = createNotebooks(2);
        printNotebooks(nb);
        Map<String, String> crit = addCrit();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the criterium for sorting: 1 - RAM, 2 - HD, 3 - OS, 4 - color.");
        int st = sc.nextInt();
        LinkedList<Notebook> nbSort = findByFilterAndSort(nb, crit, st);
        printNotebooks(nbSort);
    }

    /**
     * @param nb   Список ноутбуков
     * @param crit Критерии фильтрации в формате <Номер критерия, значение для фильтрации>
     * @param st   Поле? по которому будет проведена сортировка
     * @return Фильтрованнный и сортированный список ноутбукоа
     * @apiNote Фильтрует список ноутбуков по заданным критериям и сортирует по одному из полей
     */
    private static LinkedList<Notebook> findByFilterAndSort(ArrayList<Notebook> nb, Map<String, String> crit, int st) {
        ArrayList<Notebook> nbFilt = new ArrayList<>();

        for (Notebook item : nb) {
            boolean cr1 = true, cr2 = true, cr3 = true, cr4 = true;
            if (crit.get("1") != null)
                cr1 = item.getRam() >= Integer.parseInt(crit.get("1"));
            if (crit.get("2") != null)
                cr2 = item.getHd() >= Integer.parseInt(crit.get("2"));
            if (crit.get("3") != null)
                cr3 = item.getOs().toLowerCase().equals(crit.get("3").toString().toLowerCase());
            if (crit.get("4") != null)
                cr4 = item.getColor().toLowerCase().equals(crit.get("4").toString().toLowerCase());

            if (cr1 && cr2 && cr3 && cr4)
                nbFilt.add(item);
        }
        return sortByValue(nbFilt, st);

    }

    /**
     * @param nb Список ноутбуков
     * @param st Поле, по которому проводится сортировка
     * @return Сортированный список
     * @apiNote Сортировка списка ноутбуков по одной из характеристик
     */
    private static LinkedList<Notebook> sortByValue(ArrayList<Notebook> nb, int st) {
        LinkedList<Notebook> list = new LinkedList<>(nb);
        if (st >= 1 && st <= 4) {
            Collections.sort(list, new Comparator<Notebook>() {
                @Override
                public int compare(Notebook o1, Notebook o2) {
                    switch (st) {
                        case 1:
                            return o2.getRam() - o1.getRam();
                        case 2:
                            return o2.getHd() - o1.getHd();
                        case 3:
                            return Character.getNumericValue(o2.getOs().charAt(0))
                                    - Character.getNumericValue(o1.getOs().charAt(0));
                        case 4:
                            return Character.getNumericValue(o2.getColor().charAt(0))
                                    - Character.getNumericValue(o1.getColor().charAt(0));
                        default:
                            return 0;
                    }
                }
            });
        }
        return list;
    }

    /**
     * @return Критерии фильтрации в формате <Номер критерия, значение для фильтрации>
     * @apiNote Задание критериев фильтрации пользователем
     */
    private static Map<String, String> addCrit() {
        Map<String, String> crit = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String cr = "";
        do {
            System.out.println("Enter the number of criterium: 1 - RAM, 2 - HD, 3 - OS, 4 - color.");
            cr = sc.nextLine();
            try {
                int cr1 = Integer.parseInt(cr);
                if (cr1 > 0 && cr1 < 5) {
                    System.out.println("Enter the value for filter: ");
                    String val = sc.nextLine();
                    crit.put(cr, val);
                }
            } catch (NumberFormatException e) {
            }
            ;
        } while (!cr.isEmpty());
        System.out.println("crit = " + crit);
        return crit;
    }

    /**
     * @param nb Список ноутбуков
     * @apiNote Вывод в консоль списка ноутбуков в стоблик
     */
    private static void printNotebooks(List<Notebook> nb) {
        for (Notebook item : nb)
            System.out.println(item);
    }

    /**
     * @param n n*4 нотбуков
     * @return Список ноутбуков
     * @apiNote Генерация списка ноутбуков случайными значениями параметров
     */
    private static ArrayList<Notebook> createNotebooks(int n) {
        ArrayList<Notebook> resList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            Notebook item1 = new Notebook("Not" + Integer.toString(rand.nextInt(50)),
                    rand.nextInt(1000),
                    rand.nextInt(10000),
                    "Windows",
                    "Blue",
                    rand.nextInt(100000));
            Notebook item2 = new Notebook("Not" + Integer.toString(rand.nextInt(50)),
                    rand.nextInt(1000),
                    rand.nextInt(10000),
                    "Windows",
                    "Black",
                    rand.nextInt(100000));
            Notebook item3 = new Notebook("Not" + Integer.toString(rand.nextInt(50)),
                    rand.nextInt(1000),
                    rand.nextInt(10000),
                    "Linux",
                    "Yellow",
                    rand.nextInt(100000));
            Notebook item4 = new Notebook("Not" + Integer.toString(rand.nextInt(50)),
                    rand.nextInt(1000),
                    rand.nextInt(10000),
                    "Linux",
                    "Blue",
                    rand.nextInt(100000));
            resList.add(item1);
            resList.add(item2);
            resList.add(item3);
            resList.add(item4);
        }
        return resList;
    }
}
