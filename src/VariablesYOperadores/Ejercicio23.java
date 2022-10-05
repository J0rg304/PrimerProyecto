package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        //23. Realiza un programa que pida un número y un porcentaje, y
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");//Ejemplo 500
        double numero = sc.nextDouble();
        System.out.println("Porcentaje");//Ejemplo 3.5
        double porcentaje = sc.nextDouble();

        //a. Calcule y muestre ese número incrementado en ese porcentaje.
        double porcentajeCalculado = numero * porcentaje / 100;
        System.out.println(porcentajeCalculado);

        double IncrementadoConPorcentaje = numero + porcentajeCalculado;
        System.out.println(numero + "incrementado en un " + porcentaje + "% es " + IncrementadoConPorcentaje);
        //b. Calcule y muestre ese número decrementado en ese porcentaje.
        double deccrementandoPorcentaje = numero - porcentajeCalculado; // 500 - 17.5
        System.out.println(numero + "incrementado en un " + porcentaje + "% es " + deccrementandoPorcentaje);


    }
}
