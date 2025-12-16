import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double descuento;

        System.out.println("ingrese el monto de la compra");
        double monto = lector.nextDouble();

        double resultado = descuento(monto);
        System.out.println("el precio final es: $ " + resultado);
    }

    public static double descuento(double monto) {
        double descuento;

        if (monto > 100000) {
            descuento = monto * 0.15;
        } else if (monto >= 50000) {
            descuento = monto * 0.10;

        } else {
            descuento = monto * 0.05;
        }
        return monto - descuento;

    }

}