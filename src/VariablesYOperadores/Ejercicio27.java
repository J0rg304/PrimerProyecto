package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        //27. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
        //calificación se compone de los siguientes porcentajes:


        //a. 55% del promedio de sus tres calificaciones parciales.
        //b. 30% de la calificación del examen final.
        //c. 15% de la calificación de un trabajo final.

        // Datos que necesitamos saber:
        Scanner sc = new Scanner(System.in);
        // Tres calificaciones parciales
        System.out.println("Parcial 1: ");
        double parcial = sc.nextDouble();
        System.out.println("Parcial 2: ");
        double parcial2 = sc.nextDouble();
        System.out.println("Parcial 3: ");
        double parcial3 = sc.nextDouble();

        // Calificacion del examen final
        System.out.println("Examen final: ");
        double examenFinal = sc.nextDouble();

        // Calificacion de un trabajo final
        System.out.println("Trabajo final: ");
        double trabajoFinal = sc.nextDouble();

        // Ahora hago los calculos:
        // Promedio de sus tres  calificaciones parciales
        double promedioParciales = (parcial + parcial2 + parcial3) / 3;
        //System.out.println(promedioParciales);

        // Ya me queda solo calcular los porcentajes
        double porcentajeParciales = promedioParciales * 55 / 100;
        System.out.println(porcentajeParciales);
        double porcentajeExamenFinal = examenFinal * 30 / 100;
        System.out.println(porcentajeExamenFinal);
        double porcentajeTrabajoFinal = trabajoFinal * 15 / 100;
        System.out.println(porcentajeTrabajoFinal);

        // La calificacion sera la suma de los porcentajes que hemos calculado
        double calificacionFinal = porcentajeParciales + porcentajeTrabajoFinal;
        System.out.printf("La calificacin final sera %2f", calificacionFinal);
    }
}
