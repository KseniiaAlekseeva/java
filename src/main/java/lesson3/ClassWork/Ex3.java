package lesson3.ClassWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "Red", "Metal");
        Cube cube2 = new Cube(3, "Green", "Wooden");
        Cube cube3 = new Cube(5, "Yellow", "Wooden");
        Cube cube4 = new Cube(5, "Yellow", "Wooden");
        Cube cube5 = new Cube(3, "Yellow", "Wooden");
        Cube cube6 = new Cube(3, "Yellow", "Wooden");

        List<Cube> cubList = new ArrayList<>();
        cubList.add(cube1);
        cubList.add(cube2);
        cubList.add(cube3);
        cubList.add(cube4);
        cubList.add(cube5);
        cubList.add(cube6);

        System.out.println("cubList = " + cubList);

        Integer kyell = 0;
        Integer sumVol = 0;
        Integer kwood = 0;

        for (Cube cub : cubList) {
            if (cub.getColor().equals("Yellow")) {
                kyell++;
                sumVol += cub.volumeCube();
            }
            if (cub.getMaterial().equals("Wooden") && cub.getLength()==3)
                kwood++;
        }

        System.out.println("kyell = " + kyell + " vol = " + sumVol);
        System.out.println("kwood = " + kwood);

        System.out.println("unicCollection(cubList) = " + unicCollection(cubList));

    }

    private static Collection unicCollection(List<Cube> cubList) {
        return new HashSet<>(cubList);
    }
}
