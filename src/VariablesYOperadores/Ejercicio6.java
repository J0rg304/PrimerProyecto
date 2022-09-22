package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
        //programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
        //cuántas sobrarán tras el reparto.

        //Pedimos el numero de ardillas y de nueces
        Scanner sc = new Scanner(System.in);
        System.out.println("N de ardillas" );
        int N = sc.nextInt();
        System.out.println("N de nueces" );
        int k = sc.nextInt();

        //Las dividimos (division entera)
        int cociente = k / N; //son las nueces correspoden a cada ardilla
        int resto = k % N; //Son las que sobran

        //mostramos el resultado
        System.out.println("tocan a " + cociente + "nueces por ardilla y" + "sobran" + resto + "nueces");
    }
}
