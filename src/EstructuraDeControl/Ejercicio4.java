package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //4. Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
        //ingresos. Necesitamos almacenar en la variable boolean jasp el valor:
        //a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
        //bien la edad es menor de 30 y los ingresos superan los 28.000 euros.
        //b. false, en caso contrario.
        //Escribe el código necesario.

        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int nivelDeEstudios = sc.nextInt();
        int ingresos = sc.nextInt();

        if(edad <= 28 && nivelDeEstudios > 3 || edad < 30 && ingresos > 28000){
            System.out.println("Verdadero");
        }else {
            System.out.println("Es falso");
        }
    }
}
