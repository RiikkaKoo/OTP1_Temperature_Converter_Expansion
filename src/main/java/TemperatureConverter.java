import java.util.Scanner;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public boolean isExtremeTemperature(double celsius) {
        return (celsius > 50 || celsius < -40) ? true : false;
        //return celsius > 50 || celsius < -40;  // <-- Suggested simplification
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        System.out.println("Enter Fahrenheits to convert to Celsius: ");
        double f = scanner.nextDouble();
        double c = temperatureConverter.fahrenheitToCelsius(f);
        System.out.println(f + "°F in Celsius: " + c + "°C");
        if (temperatureConverter.isExtremeTemperature(c)) {
            System.out.println("It is an extreme temperature.");
        } else {
            System.out.println("It is not an extreme temperature.");
        }

        System.out.println("Enter Celsius to convert to Fahrenheit: ");
        double c2 = scanner.nextDouble();
        System.out.println(c2 + "°C in Fahrenheit: " + temperatureConverter.celsiusToFahrenheit(c2) + "°F");

        System.out.println("Enter Kelvin to convert to Celsius: ");
        double k = scanner.nextDouble();
        double c3 = temperatureConverter.kelvinToCelsius(k);
        System.out.println(c2 + "°K in Celsius: " + c3 + "°C");
        if (temperatureConverter.isExtremeTemperature(c3)) {
            System.out.println("It is an extreme temperature.");
        } else {
            System.out.println("It is not an extreme temperature.");
        }
    }


}
