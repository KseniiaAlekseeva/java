package lesson3.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Students> studList = createStudents();
        System.out.println("studList = " + studList);

        for (Students stud : studList) {
            int markSum=0;
            for (int mark : stud.getMarks())
                markSum+=mark;
            if (stud.getSurname().endsWith("ova") && markSum%2==0)
                System.out.println("stud.getSalary() = " + stud.getSalary());
        }
    }

    private static ArrayList<Students> createStudents() {
        ArrayList<Students> resList = new ArrayList<>();
        resList.add(new Students("Ivanova", 1, 10000, List.of(4, 5, 5)));
        resList.add(new Students("Petrov", 1, 15000, List.of(4, 3, 5)));
        resList.add(new Students("Petrova", 1, 13000, List.of(4, 4, 5)));
        resList.add(new Students("Ivanova", 1, 14000, List.of(4, 5, 5)));

        return resList;
    }
}
