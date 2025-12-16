import java.util.Scanner;

public class Pares_Impares {

    // Función que cuenta números pares e impares
    public static void contarParesImpares() {
        Scanner leer = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = leer.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        } while (numero != 0);

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

    // Método principal (INICIO)
    public static void main(String[] args) {
        contarParesImpares();
    }
}

