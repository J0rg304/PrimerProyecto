package VariablesYOperadores;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //17. Calcular el área de un triangulo ( base * altura)/2.
        Scanner sc = new Scanner(System.in);
        System.out.print("Base");
        double base = sc.nextDouble();
        System.out.print("Altura");
        double altura = sc.nextDouble();


        double area  = (base * altura)/2;
        System.out.print("el area es " + area);
        // Resuelve el ejercicio primero con
        //variables de tipo entero y después con variables de tipo float.


    }
}
