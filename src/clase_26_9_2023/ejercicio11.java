package clase_26_9_2023;
/*
Pide un numero real que represente a un precio y muestra el
precio con IVA. El IVA es del 21%
 */

import java.util.Locale;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        final double  IVA = 0.21;

        System.out.println("debe ingresar un numero real");
        double preciosinIVA = sc.nextDouble();
        double precioconIVA = preciosinIVA * (1+IVA);

    }
}
