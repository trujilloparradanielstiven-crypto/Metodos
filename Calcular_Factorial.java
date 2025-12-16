import java.util.Scanner;

public class Calcular_Factorial {

    // Función que calcula el factorial
    public static long calcularFactorial(int numero) {

        if (numero < 0) {
            return -1; // Error: número negativo
        }

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // INICIO
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num = leer.nextInt();

        long resultado = calcularFactorial(num);

        if (resultado == -1) {
            System.out.println("Error: No se puede calcular factorial de número negativo");
        } else {
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }
}

