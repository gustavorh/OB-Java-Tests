package ob.java.tests;

public class Main {
    public static void main(String[] args) {
        int resultado = sumarNumeros(10, 10, 10);

        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarNumeroPuertas();
        miCoche.incrementarNumeroPuertas();

        System.out.println("El número de puertas es: " + miCoche.numeroPuertas);
    }
    public static int sumarNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int numeroPuertas = 2;

    public void incrementarNumeroPuertas() {
        this.numeroPuertas++;
    }
}