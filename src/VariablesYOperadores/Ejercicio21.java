package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //21. Realiza un programa que pida las notas de las tres evaluaciones del módulo
        //Programación y muestre la nota final (la nota final es la media de las tres
        //evaluaciones).

        Scanner sc = new Scanner(System.in);
        System.out.println("NOta 1º Evaluacion ");
        double n1 = sc.nextDouble();
        System.out.println();
        double n2 = sc.nextDouble();
        System.out.println();
        double n3 = sc.nextDouble();
        double  suma = n1 + n2 + n3;
        double media = suma / 3;
        //Queremos mostrar la media con 2 decimales -> souf
        System.out.printf(" la nota final es %.2f" , media);
    }
}
