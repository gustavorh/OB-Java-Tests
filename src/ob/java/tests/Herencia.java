package ob.java.tests;

public class Herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Gustavo";
        cliente.edad = 20;
        cliente.telefono = 941884650;
        cliente.credito = 5000;

        System.out.println("El nombre del cliente es: " + cliente.nombre);
        System.out.println("La edad del cliente es: " + cliente.edad);
        System.out.println("El teléfono del cliente es: " + cliente.telefono);
        System.out.println("El crédito del cliente es: $" + cliente.credito + " USD.");

        System.out.println("-----------------------------------------");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Ignacio";
        trabajador.edad = 20;
        trabajador.telefono = 941884650;
        trabajador.salario = 1000;
        System.out.println("El nombre del trabajador es: " + trabajador.nombre);
        System.out.println("La edad del trabajador es: " + trabajador.edad);
        System.out.println("El teléfono del trabajador es: " + trabajador.telefono);
        System.out.println("El salario del trabajador es: $" + trabajador.salario + " USD/Mes.");

    }
}

class PersonaHerencia {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends PersonaHerencia {
    int credito;
}

class Trabajador extends PersonaHerencia {
    int salario;
}
