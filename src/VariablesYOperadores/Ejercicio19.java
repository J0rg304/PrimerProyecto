package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        //19. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el
        //plano. Calcula y muestra la distancia entre ellos.

        Scanner sc = new Scanner(System.in);
        System.out.println("x1: ");
        double x1 = sc.nextDouble();
        System.out.println("y1 ");
        double y1 = sc.nextDouble();
        System.out.println("x2 ");
        double x2 = sc.nextDouble();
        System.out.println("y2 ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow((x1 -  x2), 2) + Math.pow((y2 - y1), 2));
        System.out.println("la distancia entre A ("+ x1 + ", " + y1 + " ) y B ("+ x2 + " ," + y2 + ")es " + distancia);
    }
}
