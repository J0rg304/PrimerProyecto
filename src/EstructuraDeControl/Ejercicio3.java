package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //3. Escribe un programa que pida dos números e indique si el primero es mayor que el
        //segundo o no.
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero");
        int numero1 = sc.nextInt();
        System.out.println("Segundo numero");
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("El numero1 es mayor");
        }else {
            System.out.println("El numero2 es mas pequeño");
        }
    }
}
