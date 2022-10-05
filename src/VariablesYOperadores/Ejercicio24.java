package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        //24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
        //productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
        //importe a abonar.

        Scanner sc = new Scanner(System.in);
        System.out.println("Precio del producto");
        double precio = sc.nextDouble(); // 100


        System.out.println("Cantidad de productos a comprar");
        int cantidad = sc.nextInt(); // 5

        System.out.println("Porcentaje de IVA a aplicar");
        double porcentajeIVA = sc.nextDouble(); // 10%

        //1 Calcular el precio sin IVA total

        double precioSinIVA = precio * cantidad;
        System.out.println(precioSinIVA); //

        //2 Calcular el IVA calculado
        double IVACalculado = precioSinIVA * porcentajeIVA / 100; // 500 * 10 / 100 = 50
        System.out.println(IVACalculado);

        //3 Precio con IVA
        double precioConIVA = precioSinIVA + IVACalculado; // 500 + 50
        System.out.println("Debe abonar " + precioConIVA + " €");
    }
}
