public class EjerciciosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puedo asignar un int a long sin mas (casting implicito)

        // y al reves ?
        long numGrande2 = 101; //Long ocupa 64 bits
        int entero = (int) numGrande2; // esto es un casting explicito

        // de int a short -> casting explicito
        short  numeroCorto = (short) num; // No puedo hacerlo directamente porque int son 32 bits y no caben en

        // de char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);
        // de float a double
        float decimal  = 3.1416f;
        double decimalDoble = decimal;

        // de double a float
        double decimalDoble2 = 3.1234567;
        float decimalf = (float) decimalDoble2;

        // de double a int
        int entero32bits = (int) decimalDoble2;
        System.out.println(entero32bits); // resultado imprevisible



        // de double a short
        short entero16bits = (short) decimalDoble2;
    }
}