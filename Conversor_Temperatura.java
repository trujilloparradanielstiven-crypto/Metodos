import java.util.Scanner;

public class Conversor_Temperatura {

    // Funciones de conversión
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // INICIO
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");
        System.out.println("4. Kelvin a Celsius");
        System.out.print("Elija una opción: ");
        int opcion = leer.nextInt();

        double temp, resultado;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese temperatura en Celsius: ");
                temp = leer.nextDouble();
                resultado = celsiusAFahrenheit(temp);
                System.out.println(temp + " °C = " + resultado + " °F");
                break;

            case 2:
                System.out.print("Ingrese temperatura en Fahrenheit: ");
                temp = leer.nextDouble();
                resultado = fahrenheitACelsius(temp);
                System.out.println(temp + " °F = " + resultado + " °C");
                break;

            case 3:
                System.out.print("Ingrese temperatura en Celsius: ");
                temp = leer.nextDouble();
                resultado = celsiusAKelvin(temp);
                System.out.println(temp + " °C = " + resultado + " K");
                break;

            case 4:
                System.out.print("Ingrese temperatura en Kelvin: ");
                temp = leer.nextDouble();
                resultado = kelvinACelsius(temp);
                System.out.println(temp + " K = " + resultado + " °C");
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}
