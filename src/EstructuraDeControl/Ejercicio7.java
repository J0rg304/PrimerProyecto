package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //7. Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
        //• En caso afirmativo el usuario responderá true
        //• En caso contrario responderá false.
        //Si el usuario responde true se le responderá “a la cárcel”. En
        // caso contrario, “¡a casa!”.

        Scanner sc = new Scanner(System.in);
        System.out.println("Eres culpable ?");
        boolean culpable = sc.hasNextBoolean();

        if (culpable) {
            System.out.println("A la carcel");
        }
        else{
            System.out.println("A casa");
        }
    }
}
