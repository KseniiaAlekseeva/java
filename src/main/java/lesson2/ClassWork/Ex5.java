package lesson2.ClassWork;

public class Ex5 {
    public static void main(String[] args) {
        // Создайте класс, который описывает вектор (в трёхмерном пространстве).
        Vector vector=new Vector(1,2,3);
        System.out.println(vector.toString());
        Vector vector1=new Vector();
        vector1.x=0;
        vector1.y=1;
        vector1.z=2;
        System.out.println(vector1.toString());
        System.out.println("vector.length() = " + vector.length());
        System.out.println("vector.scalar = " + vector.scalar(vector1));
        System.out.println("vector.multiVec = " + vector.multiVec(vector1).toString());
        System.out.println("vector.angle= " + vector.angle(vector1));
    }
}
