package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //8. Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
        //tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
        //son 3 horas, 30 minutos y 10 segundos.

        //Reciba un tiempo en segundos
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt(); //por ejemplo  3751 segundos


        //Calcular de este tiempo las horas minutos y segundos

        //De los segundos que entran primero divido por 60 para saner cuantos minutos y segundos hay
        int minutos = segundos / 60; //62 minutos con ese ejemplo
        int segunsdosRestantes = segundos % 60; //el testp es 31 segundps
        //en esos minutos puede haber una hora o mas como es este caso
        int horas = minutos / 60; //En el ejemplo sale 1
        int minutosRestantes = minutos % 60; //en el ejemplo, 2


        // muestre por pantalla este
        //tiempo pero expresado en horas minutos y segundos
        System.out.println(segundos + " contienen " + horas + " horas " + minutosRestantes + " minutos y " + segunsdosRestantes + " segundos");
    }
}
