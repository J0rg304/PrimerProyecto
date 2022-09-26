package VariablesYOperadores;

public class Ejercicio14 {
    public static void main(String[] args) {
        //14. Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.
        // Formula 2 * pi * r

        double radio  = 3;

        // NEW el numero pi lo podemos poner directamente como math.pi

        double circunferencia = 2 * Math.PI * radio;
        System.out.println(circunferencia);

        // New para mostrar un numero de muchos decimales con solo 2
        System.out.printf("La circunferencia es %.2f", circunferencia);
    }
}
