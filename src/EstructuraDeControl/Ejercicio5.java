package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //5. Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
        //de ellos.



        //Vamos a usar dos variables auxiliares: max y min
        //En max vamos a ir guardando temporalmente el numero mayor que tengamos
        Scanner sc =  new Scanner(System.in);
        System.out.println("Primer numero");
        int num1 = sc.nextInt();
        //Al pedir el primer numero ese es el mayor y el menor que tenemos de momento asique lo asignamos a esas variables
        int max = num1;
        int min = num1;
        if (num1 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num1;
        }
        System.out.println("Segundo numero");
        int num2 = sc.nextInt();
        if (num2  > max){ // Si num2 es mayor que el que teniamos guardado en max
            max = num2;
        }
        if (num2 < min) {
            min = num2; // Si num2 es menor que el que teniamos lo guardamos en min
        }
        System.out.println("Tercer numero");
        int num3 = sc.nextInt();
        if (num3 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num3;
        }
        System.out.println("Cuarto numero");
        int num4 = sc.nextInt();
        if (num4 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num4;
        }
        System.out.println("Quinto numero");
        int num5 = sc.nextInt();
        if (num5 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num5;
        }
        System.out.println("Sexto numero");
        int num6 = sc.nextInt();
        if (num6 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num6;
        }
        System.out.println("Septimo numero");
        int num7 = sc.nextInt();
        if (num7 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num7;
        }
        System.out.println("Octavo numero");
        int num8 = sc.nextInt();
        if (num8 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num8;
        }
        System.out.println("Noveno numero");
        int num9 = sc.nextInt();
        if (num9 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num9;
        }
        System.out.println("Decimo numero");
        int num10 = sc.nextInt();
        if (num10 > max) { // Si num2 es menor que el que teniamos lo guardamos en min
            max = num10;
        }
        System.out.println("");

    }
}
