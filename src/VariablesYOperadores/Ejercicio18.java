package VariablesYOperadores;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //18. Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
        //visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:


        //Reamur = Centígrados x 0.8
        //Fahenheit = (Centígrados * 9/5)+32
        //Kelvin = Centígrados + 273

        Scanner sc = new Scanner(System.in);
        System.out.print("que marca");
        double Grados = sc.nextDouble();


        double Reamur = Grados * 0.8;
        double Fahenheit = (Grados * 9/5)+35;
        double Kelvin = Grados + 273;

        System.out.print("los grados " + Reamur + " f " + Fahenheit + " f " + Kelvin);
    }
}
