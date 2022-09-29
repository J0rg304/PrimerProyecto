public class EjemploBoolean {
    public static void main(String[] args) {
        boolean apto = true;
        System.out.println("¿Es apto?" + apto);

        // Operadores logicos
        // Unario: ¡ NOT

        System.out.println(!apto);

        //Operadores binarios: se utilizan dos variables
        //AND y
        System.out.println("AND");
        System.out.println("===");
        boolean v1 = true;
        boolean v2 = false;
        boolean v3 = v1 && v2;
        System.out.println(v3);

        // OR o ||
        System.out.println("OR ");
        boolean or = v1 || v2;
        System.out.println(or);

        // XOR ^
        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);
    }
}
