package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        //24. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es
        //menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b,
        //ambos inclusive.
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("a: ");
        int b = sc.nextInt();
        // Tenemos que hacer uuna suma desde a hasta b
        for (int i = a; i <=b; i++ );
        // Declaramos una variable suma inicializando a 0
        int suma = 0;
        for(int i = a; i<= b; i++){
            suma = suma + i;
        }
        System.out.println("Resultado: " + suma);
    }
}
