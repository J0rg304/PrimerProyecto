package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //8. Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
        //“no” (en vez de true/false).

        Scanner sc = new Scanner(System.in);
        System.out.println("Eres culpable ?");
        String culpable = sc.nextLine();


        if (culpable.equals("S")) { // La comparacion entre strings se hace con el metodo equals
            System.out.println("A la carcel");
        }
        else if(culpable.equals("N")){
            System.out.println("A casa");
        }
        else {
            System.out.println("Pues muy bien");
        }
    }
}
