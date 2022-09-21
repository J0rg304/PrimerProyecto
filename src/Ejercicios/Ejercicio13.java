package Ejercicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //13. Imagina que eres un gerente de recursos humanos en un restaurante y necesitas
        //contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares
        //sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia,
        //preferencia de cocina. Escribe un programa que lea todas las palabras (o números)

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int experiencia = sc.nextInt();
        //Para que no salte añadimos la siguiente linea
        sc.nextLine();
        //y ponemos el nextline() que tocaba poner
        String preferenciaCocina = sc.nextLine();


        //una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años
        //y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos
        //con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE
        //COCINA>".
        System.out.println("el formulario de" + nombre +  " ," + edad + "años de " + experiencia + "de experiencia esta completo nos comunicaremos con usted" + "si necesitamos a alguien que cocine su comida" + preferenciaCocina + ",");
    }
}
