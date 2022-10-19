package EstructuraDeControl;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una accion (1-4)");
        int accion = sc.nextInt();
        /*
        if (accion == 1) {
            System.out.println("Comenzando partida");
        }else if (accion == 2) {
            System.out.println("Cargando partida guardada");
        }else if (accion == 3){
            System.out.println("Mostrar ayuda");
        }else if (accion == 4) {
            System.out.println("Salir");
        }else {
            System.out.println("Accion incorrecta");
        }*/
        // Esto se puede poner de otra forma
        // Cuando en el if tienes == 0 equals -> evaluas el valor de una variable y  segun sea haces una accion u ptra
        switch (accion) { //En ese parentesis solo puede ir el nombre de la variable
            case 1:
                System.out.println("Comenzando partida");
                break;
            case 2:
                System.out.println("Cargando partida guardada");
                break;
            case 3:
                System.out.println("Mostrar ayuda");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default: // Aqui entra si no se cumple ninguno de los casos anteriores
                System.out.println("Accion incorrecta");
                break;
        }
    }
}
