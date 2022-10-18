package P01JorgeCabrera;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime los kg");
        double kg = sc.nextDouble();
        System.out.print("Dime la altura");
        double altura = sc.nextDouble();

        double MasaCorporal = kg / (altura * altura);
        System.out.printf("La masa corporal es %.2f" , MasaCorporal);
    }
}
