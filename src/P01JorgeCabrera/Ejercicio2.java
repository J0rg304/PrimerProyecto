package P01JorgeCabrera;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dime los dias");
        int dias = sc.nextInt();
        int diass = dias / 7;

        int semana = dias % 7;

        System.out.print("en " + dias + " dias " + " hay " + semana + " semanas y  " + diass + " dias");
    }
}
