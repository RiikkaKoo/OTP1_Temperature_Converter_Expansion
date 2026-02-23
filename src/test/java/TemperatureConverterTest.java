import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final double DELTA = 0.01;

    @Test
    public void testFahrenheitToCelsiusConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        double f1 = 32;
        double c1 = converter.fahrenheitToCelsius(f1);

        double f2 = 45.5;
        double c2 = converter.fahrenheitToCelsius(f2);

        double f3 = -13;
        double c3 = converter.fahrenheitToCelsius(f3);

        assertEquals(0, c1, DELTA);
        assertEquals(7.5, c2, DELTA);
        assertEquals(-25, c3, DELTA);
    }

    @Test
    public void testCelsiusToFahrenheitConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        double c1 = 0;
        double f1 = converter.celsiusToFahrenheit(c1);

        double c2 = 7.5;
        double f2 = converter.celsiusToFahrenheit(c2);

        double c3 = -25;
        double f3 = converter.celsiusToFahrenheit(c3);

        assertEquals(32, f1, DELTA);
        assertEquals(45.5, f2, DELTA);
        assertEquals(-13, f3, DELTA);
    }

    @Test
    public void testKelvinToCelsiusConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        double k1 = 273.15;
        double c1 = converter.kelvinToCelsius(k1);

        double k2 = 300;
        double c2 = converter.kelvinToCelsius(k2);

        double k3 = 256.45;
        double c3 = converter.kelvinToCelsius(k3);

        assertEquals(0, c1, DELTA);
        assertEquals(26.85, c2, DELTA);
        assertEquals(-16.7, c3, DELTA);
    }

    @Test
    public void testCelsiusAndFahrenheitConversionsTogether() {
        TemperatureConverter converter = new TemperatureConverter();

        double startCelsius = 19;
        double f = converter.celsiusToFahrenheit(startCelsius);
        double endCelsius = converter.fahrenheitToCelsius(f);

        assertEquals(startCelsius, endCelsius, DELTA);


        double startFahrenheit = 52;
        double c = converter.fahrenheitToCelsius(startFahrenheit);
        double endFahrenheit = converter.celsiusToFahrenheit(c);

        assertEquals(startFahrenheit, endFahrenheit, DELTA);
    }

    @Test
    public void testIsExtremeTemperatureCheck() {
        TemperatureConverter converter = new TemperatureConverter();

        assertFalse(converter.isExtremeTemperature(5));
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(-39.9));
        assertFalse(converter.isExtremeTemperature(50));
        assertFalse(converter.isExtremeTemperature(49.9));

        // Are extreme temperatures:
        assertTrue(converter.isExtremeTemperature(-40.5));
        assertTrue(converter.isExtremeTemperature(-40.1));
        assertTrue(converter.isExtremeTemperature(-40.001));
        assertTrue(converter.isExtremeTemperature(-41));

        assertTrue(converter.isExtremeTemperature(50.5));
        assertTrue(converter.isExtremeTemperature(50.1));
        assertTrue(converter.isExtremeTemperature(50.001));
        assertTrue(converter.isExtremeTemperature(51));

    }

}