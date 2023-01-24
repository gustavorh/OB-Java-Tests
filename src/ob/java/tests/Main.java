package ob.java.tests;

public class Main {
    public static void main(String[] args) {
        int resultado = sumarNumeros(10, 10, 10);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        int puertas = miCoche.incrementarNumeroPuertas(1);

        System.out.println(puertas);
    }
    public static int sumarNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    int numeroPuertas = 0;

    public int incrementarNumeroPuertas(int cantidad) {
        return numeroPuertas + cantidad;
    }
}