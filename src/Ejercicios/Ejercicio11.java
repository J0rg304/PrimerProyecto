package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Esribe un programa que lea cinco palabras de la entrada estandar y genere cada palabra en una nueva linea, las palabras deben estar en el mismo orden

        Scanner sc = new Scanner(System.in);
        String palabra1 = sc.next();
        String palabra2 = sc.next();
        String palabra3 = sc.next();
        String palabra4 = sc.next();
        String palabra5 = sc.next();
        //Las escribo cada una en una linea
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);
        System.out.println(palabra4);
        System.out.println(palabra5);
    }
}
