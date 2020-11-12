package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TempConverterTest {
    TempConverter tempConverter;

    @BeforeEach
    void setup() {
        tempConverter = new TempConverter();
    }

    @Test
    @DisplayName("WHEN temperature is in Fahrenheit THEN return in Celsius")
    void testFahrenheitToCelsius() {
        //GIVEN
        //WHEN
        double received = tempConverter.fahrenheitToCelsius(100.00);
        //THEN
        assertThat(received).isEqualTo(37.77777777777778);
    }

    @Test
    @DisplayName("WHEN temperature is in Fahrenheit THEN return in Celsius")
    void testFahrenheitToCelsius2() {
        //GIVEN
        //WHEN
        double received = tempConverter.fahrenheitToCelsius(0.00);
        //THEN
        assertThat(received).isEqualTo(-17.77777777777778);
    }

    @Test
    @DisplayName("WHEN temperature is in Fahrenheit THEN return in Celsius")
    void testFahrenheitToCelsius3() {
        //GIVEN
        //WHEN
        double received = tempConverter.fahrenheitToCelsius(50);
        //THEN
        assertThat(received).isEqualTo(10);
    }

    @Test
    @DisplayName("WHEN temperature is is Celsius THEN return in Fahrenheit")
    void testCelsiusToFahrenheit() {
        //GIVEN
        //WHEN
        double received = tempConverter.celsiusToFahrenheit(37.77777777777778);
        //THEN
        assertThat(received).isEqualTo(100);
    }

    @Test
    @DisplayName("WHEN temperature is is Celsius THEN return in Fahrenheit")
    void testCelsiusToFahrenheit2() {
        //GIVEN
        //WHEN
        double received = tempConverter.celsiusToFahrenheit(-17.77777777777778);
        //THEN
        assertThat(received).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN temperature is is Celsius THEN return in Fahrenheit")
    void testCelsiusToFahrenheit3() {
        //GIVEN
        //WHEN
        double received = tempConverter.celsiusToFahrenheit(10);
        //THEN
        assertThat(received).isEqualTo(50);
    }
}
