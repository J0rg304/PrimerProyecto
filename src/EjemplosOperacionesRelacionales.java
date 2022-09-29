import java.util.Scanner;

public class EjemplosOperacionesRelacionales {
    public static void main(String[] args) {
        // Sirven para comparar dos numeros (normalmente) y dan como resultado un boolean

        int num1 = 35;
        int num2 = 23;

        num2 = num1; // estoy asignando a num2 el valor de num1

       boolean comparacion =  num2 == num1; // Estoy comparando los valores de num1 y el resultado (true) lo asigno a comparacion

        boolean otracomparacion = num2 != num1;

        int nueve = 9;
        int otroNueve = 9;
        int diez = 10;

        System.out.println(nueve > otroNueve);
        System.out.println(nueve >= otroNueve);

        int edad = 18;
        System.out.println("¿Mayor de edad?" + (edad >= 18));
        System.out.println("¿Mayor de edad?" + (edad > 17));


        //Cuando aparecen operadores mezclados de distinto tipo ()

        //1o) Paréntesis
        //2o) Incrementos y decrementos (++ y --)
        //3o) Operadores aritméticos (en el orden habitual: primero * y /, después + y -)
        //4o) Operadores relacionales (>, >=, ==, etc.)
        //5o) Operadores lógicos (en el orden indicado: !, ^, &&, ||)

        int num = 1000;
        boolean resultado = num  + 10 > num + 9; //1010 > 1009

        // unir operaciones relacionales usando operadores logicos
        int a = 5;
        int b = 6;
        int c = 7;
        // quiero saber si a <= b <= c

        //System.out.println(a <= c); //esto asi no se puede poner
        // Hay que hacer la comparacion de dos en dos con un and
        System.out.println(a <= b && b <= c);

        // Ejemplo pedimos tres estaturas por teclado y queremos ver si estan en orden ascendente
        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        boolean ordenAscendente = estatura1 <= estatura2 && estatura2 <= estatura3;
        System.out.println("Orden ascendente " + ordenAscendente);
        //Tambien comprobamos de que este en orden descendente
        boolean ordenDescendente = estatura1 >= estatura2 && estatura2 >= estatura3;
        System.out.println("Orden descendente " + ordenDescendente);
        // == (igual a)
        // != (distinto de)
        // > (mayor que)
        // >= (mayor o igual que)
        // < (menor que)
        // <= (menor o igual que)

    }
}