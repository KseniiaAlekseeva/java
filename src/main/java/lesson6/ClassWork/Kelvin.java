package lesson6.ClassWork;

public class Kelvin implements Converter {
    @Override
    public double convertValue(double baseValue) {
        return baseValue + 273.15;
    }
}
