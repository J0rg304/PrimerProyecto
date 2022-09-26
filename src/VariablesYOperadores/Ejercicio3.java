package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //4. Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
        //suma de los dos primeros y el producto del tercero y el cuarto


        //Aqui pedimos cuatro numeros
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        //aqui hacemos la operacion
        int suma = n1 + n2;
        int producto = n3 * n4;
        //y aqui la resolvemos

        System.out.println();
    }
}
