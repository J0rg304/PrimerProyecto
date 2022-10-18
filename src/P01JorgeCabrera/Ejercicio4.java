package P01JorgeCabrera;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pan");
        double producto = sc.nextDouble();
        System.out.print("Dime el precio");
        double precio = sc.nextDouble();

        double mensual = producto * -0.6 / 100;
        double anual = precio * 9 / 100;

        System.out.printf("El precio mensual es" + mensual + " y el precio anual " + anual);
    }
}
