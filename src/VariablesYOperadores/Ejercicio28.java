package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        //27. Escribe un programa que, dado un número n introducido por teclado, dibuje un
        //cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
        //Ejemplo:.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("No me vale para hacer un cuadrado");
        }else {
            System.out.println("Caracter ");
            char c = sc.next().charAt(0);
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }// Para imprimir caracteres se utilizan el char y el string

    }
}
