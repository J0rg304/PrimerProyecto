import java.util.Scanner;
import java.util.SortedMap;

public class EjemplosConTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            //Ahora ya podemos meter datos con teclados
            //Pero para poder utilizarlos en el programa
            //Tenemos que guardarlo en una variable
            //las variables que guarden palabras o cadenas de texto se llama String
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();//Aqui escribo el nombre en el teclado y lo guardo  en la variable

        System.out.println("Hola, " + nombre);
        System.out.println(" Introduce tu apellido");
        //Hacemos otra variable para guardar el apellido que va a entrar por teclado
        String apellidos = sc.nextLine();
        System.out.println("hola," + nombre + " " + apellidos);
        //Ahora hacemos lo mismo pero con la edad que aqui metemos numeros
        System.out.println("Cuantos años tienes:");
        int edad = sc.nextInt();

        //Este metodo nextint tienne un peligro si a continuacion pones un nextline() se lo va a saltar, la manera de evitarlo es cada vez que yo escribo nextint(), si se que luego voy a poner nextline(), escribo un nextline() adicional sin mas, de esta manera "limpiamos"
        sc.nextLine();//esto es solo para evitar que salte
        System.out.println("Vaya pareces muy joven para tener " + " " + edad + "años");
        //ahora con mascotas
        System.out.println("Tines mascota ?");
        String mascota = sc.nextLine();
        System.out.println("Pues muy bien");

        //vamos a meter un dato con decimales
        System.out.println("y cual es tu patrimonio?");
            double patrimonio = sc.nextDouble();
        System.out.println("es muy poco");
        //con los decimales cuando los escribimos en el codigo fuente se  pone . pero cunado metemos los datos por teclado se pone ,
    }
}
