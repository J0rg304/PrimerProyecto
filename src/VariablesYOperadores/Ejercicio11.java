package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //11. Dado un número de dos cifras,
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero de dos cifras");
        int numero = sc.nextInt();
        // escribe un programa que permita obtener el número
        //invertido. Ejemplo, si se introduce 23 que muestre 32.

        //Extraemos las decenas
        int decenas = numero / 10;
        int unidades = numero % 10;

        //Lo mostramos al reves

        System.out.println(unidades + " " + decenas);
    }
}
