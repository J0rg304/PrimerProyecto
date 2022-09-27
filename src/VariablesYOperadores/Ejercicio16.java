package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //16. Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla el
        Scanner  sc = new Scanner(System.in);
        System.out.printf("Dime el lado del cuadrado");
        double lado = sc.nextInt();
        //perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
        //del lado por cuatro).
        double perimetro = lado * 4;
        //y muestra por pantalla ek perimtro del mismo
        System.out.printf("perimtro " + perimetro + "cms");
    }
}
