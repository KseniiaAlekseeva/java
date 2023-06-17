package lesson3.HomeWork;

import java.util.ArrayList;
import java.util.List;

import static lesson2.HomeWork.Ex1.isSimple;

public class Ex3 {
    public static void main(String[] args) {
        List<Book> booksList = createBooks();
        System.out.println("booksList = " + booksList);
        System.out.println("isSimple(5) = " + isSimple(5));
        System.out.println("findBookName(booksList) = " + findBookName(booksList));
    }

    /**
     * @param booksList Список книг
     * @return Список названий книг, удовлетворяющих условию
     * @apiNote Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    private static ArrayList<String> findBookName(List<Book> booksList) {
        ArrayList<String> nameList = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getYear() > 2009 && book.getAuthorSurname().toLowerCase().contains("а") && isSimple(book.getPages()))
                nameList.add(book.getName());
        }

        return nameList;
    }

    /**
     * @return Список экземпляров объекта типа Product
     * @apiNote Создает список экземпляры объекта типа Product
     */
    private static ArrayList<Book> createBooks() {
        ArrayList<Book> resList = new ArrayList<>();
        resList.add(new Book("Интересная история", "Пирогов", 1000, 2010, 11));
        resList.add(new Book("Интересная история приключений", "Пирогова", 1000, 2011, 21));
        resList.add(new Book("Интересная история приключений 2", "Пирогова", 1000, 2008, 13));
        resList.add(new Book("Интересная книга", "Иванов", 1000, 2018, 2));
        resList.add(new Book("Нентересная книга", "Ивонов", 1000, 2018, 5));
        resList.add(new Book("Очень интересная книга", "Новикова", 1000, 2018, 7));
        return resList;
    }
}
