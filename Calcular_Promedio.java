import java.util.Scanner;

public class Calcular_Promedio {

    // Función que calcula el promedio de calificaciones
    public static void calcularPromedio() {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int invalidas = 0;
        int calificacion;

        do {
            System.out.print("Ingrese una calificación (0-10) o -1 para terminar: ");
            calificacion = leer.nextInt();

            if (calificacion != -1) {
                if (calificacion >= 0 && calificacion <= 10) {
                    suma += calificacion;
                    contador++;
                } else {
                    invalidas++;
                    System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                }
            }

        } while (calificacion != -1);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificaciones válidas: " + contador);
            System.out.println("Calificaciones inválidas: " + invalidas);
        } else {
            System.out.println("No se ingresaron calificaciones válidas.");
        }
    }

    // INICIO
    public static void main(String[] args) {
        calcularPromedio();
    }
}

