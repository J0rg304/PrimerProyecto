package EstructuraDeControl;

import java.util.Scanner;

public class Ejemplo2Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia de la semana");
        String dia = sc.nextLine();
        int numero = 0;
        switch (dia) {
            case "Lunes":
                numero= 1;
                break;
            case "Martes":
                numero=2;
                break;
            case "Miercoles":
                numero=3;
                break;
            case "Jueves":
                numero=4;
                break;
            case "Viernes":
                numero=5;
                break;
            default:
                System.out.println("Lo que has introducido que no es un dia de la semana");
        }
        System.out.println(numero);
    }
}
