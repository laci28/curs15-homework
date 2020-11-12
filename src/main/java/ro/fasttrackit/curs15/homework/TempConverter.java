package ro.fasttrackit.curs15.homework;

public class TempConverter {
    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double temperature) {
        return temperature * 1.8 + 32;
    }
}
