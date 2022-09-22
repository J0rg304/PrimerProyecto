package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosEnteros {
    public static void main(String[] args) {
        //pedir por teclado dos numeros y guardarlos en dos variables de tipo entero
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero");
        int num1 = sc.nextInt();

        System.out.println("Segundo numero ");
        int num2 = sc.nextInt();

        //crear variable que guarden el resultado de las cinco operaciones posibles
        int suma=num1 + num2;
        int resta=num1 - num2;
        int producto=num1 * num2;
        int cociente = num1 / num2; // OJO: Es el cociente de la division entero
        int resto = num1 % num2;
        //mostrar el resultado de cada operacion
        System.out.println(num1 + " +" + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println("El resto de dividir" + num1 + " entre" + num2 + " es igual a " + resto);
    }
}
