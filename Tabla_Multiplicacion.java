import java.util.Scanner;

public class Tabla_Multiplicacion {

    // Función que genera la tabla de multiplicar
    public static void generarTabla(int numero, int limite) {

        for (int i = 1; i <= limite; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    // INICIO
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número para la tabla: ");
        int num = leer.nextInt();

        System.out.print("¿Hasta qué número quiere la tabla?: ");
        int lim = leer.nextInt();

        generarTabla(num, lim);
    }
}

