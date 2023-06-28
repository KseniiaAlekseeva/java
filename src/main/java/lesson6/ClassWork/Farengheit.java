package lesson6.ClassWork;

public class Farengheit implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}
