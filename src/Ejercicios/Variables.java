package Ejercicios;

public class Variables {
    public static void main(String[] args) {
        //Variables
        int a; //Declaro la variable a (a partir de ahora hay un trocito de memoria que se llama a)
                //Las variables se declaran en minuscula
                a = 5; //Aqui estamos declarando la variable A y a continuacion guarda en ella el valor 5
        System.out.println("la variable a vale " + a);
        //Su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("la variable a vale " + a);

        //Reglas para aumentar variables
        //No puede comenzar por ningun digito
            //int 5c = 4; ..> no compilo
        //Puede contener cualquier letra o digito
            //int c58 = 2;
        //No puede contener ningun caracter especial (Signos de puntuacion...) a excepcion de los caracteres
            int _variable = 3;
            int $otraVariable = 4;
        //No puede contener espacion
            //int otra variable; -->No compilo;

        System.out.println("Tipos de variables");
        System.out.println("==================");
        System.out.println("Las variables se declaran poniendo 1º el tipo de variable que es y 2º el nombre que le damos a la variable");
        System.out.println("Variables para numeros enteros:Byte, short, ");
        System.out.println("byte");
            byte variableBytePos = 127; // es el numero mas grande que puedo guardar en una variable de tipo byte
            byte variableByteNeg = -128; //es el numero mas pequeño que puedo guardar en una variable byte
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Numeros con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; //si declaras una variable de tipo float ponemos
    }
}
