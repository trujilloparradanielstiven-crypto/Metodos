import java.util.Scanner;

public class Calcular_Areas {

    // Función para calcular el área del círculo
    public static double areaCirculo(double radio) {
        double PI = 3.14159;
        return PI * radio * radio;
    }

    // Función para calcular el área del rectángulo
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular el área del triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // INICIO
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE ÁREAS ===");
        System.out.println("1. Área del círculo");
        System.out.println("2. Área del rectángulo");
        System.out.println("3. Área del triángulo");
        System.out.print("Seleccione una opción: ");
        int opcion = leer.nextInt();

        double area, base, altura, radio;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                radio = leer.nextDouble();
                area = areaCirculo(radio);
                System.out.println("El área del círculo es: " + area);
                break;

            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                base = leer.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                altura = leer.nextDouble();
                area = areaRectangulo(base, altura);
                System.out.println("El área del rectángulo es: " + area);
                break;

            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                base = leer.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                altura = leer.nextDouble();
                area = areaTriangulo(base, altura);
                System.out.println("El área del triángulo es: " + area);
                break;

            default:
                System.out.println("Opción inválida");
        }
    }
}
