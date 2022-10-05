package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        //26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
        //vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        //tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
        //su sueldo base y comisiones.

        // Variables: sueldoBase, comision (el 10% sobre la venta), venta (hace 3 ventas)

        // Datos que necesitamos pedir:
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base");
        double sueldoBase = sc.nextDouble(); // 100
        System.out.println("Importe venta 1");
        double venta1 = sc.nextDouble(); // 150
        System.out.println("Importe venta 2");
        double venta2 = sc.nextDouble(); // 200
        System.out.println("Importe venta 3");
        double venta3 = sc.nextDouble(); // 175

        // Ahora calculamos la comision

        double comision1 = venta1 * 10 / 100; // 15
        double comision2 = venta1 * 10 / 100; // 20
        double comision3 = venta1 * 10 / 100; // 17.5
        double comision = comision1 + comision2 + comision3; // 52.5

        System.out.println("Obtendra por comisiones " + comision + " euros");
        // Y el total que recibira en el mes tomando en cuenta su sueldo base y comisiones
        double sueldoTotal = sueldoBase + comision; // 1152,5
        System.out.println("En total recibira " + sueldoTotal + " Euros ");
    }
}
