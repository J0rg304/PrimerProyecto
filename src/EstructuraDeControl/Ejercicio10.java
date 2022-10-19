package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //10. Escribe un programa que pida tres números y los muestre ordenados (de mayor a
        //menor);
        Scanner sc = new Scanner(System.in);
        System.out.println("n1:");
        int n1 = sc.nextInt();
        System.out.println("n2:");
        int n2 = sc.nextInt();
        System.out.println("n3:");
        int n3 = sc.nextInt();

        // Los tenemos que mostrar ordenados de mayor a menor

        // n1 n2 n3
            if (n1 > n2 && n2 > n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            }else if (n1 > n3 && n3 > n2 ) {
                System.out.println(n1 + " " + n3 + " " + n2);
            }else if (n2 > n1 && n1 > n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            }else if(n2 > n3 && n3 > n1) {
                System.out.println(n2 + " " + n3 + " " + n1);
            }else if(n3 > n1  && n1 > n2) {
                System.out.println(n2 + " " + n3 + " " + n1);
            }else {
                System.out.println(n3 + " " + n2 + " " + n1);
            }
        // n1 n3 n2

        // n2 n1 n3

        // n2 n3 n1

        // n3 n1 n2

        // n3 n2 n1
    }
}
