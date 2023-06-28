package lesson6.ClassWork;

public class Ex4 {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp C = " + new Celcium().convertValue(temp));
        System.out.println("temp F = " + new Farengheit().convertValue(temp));
        System.out.println("temp K = " + new Kelvin().convertValue(temp));
    }
}
