package EstructuraDeControl;

public class EjemplosFor {
    public static void main(String[] args) {
        // Queremos imprimir todos los numeros del 0 al 10 (Ambos inclusive)
        for(int i = 0; i <=10; i++){// Desde que i es igual a 0 y mientras i sea  <=10 vamos a incrementar la i de 1 en 1
            // Dentro del bloque escribimos lo que se tiene que hacer en cada repeticion
            System.out.println(i);
        }
        // Queremos imprimir de 1 a 10 ambos inclusive
        for(int i = 1; i < 11; i = i + 1){ // i = i + 2; i += 2
            System.out.println(i);
        }
        // queremos imprimir de 10 a 0 decrentando de 1 en 1
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
