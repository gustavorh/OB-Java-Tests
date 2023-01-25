package ob.java.tests;

public class Privacidad {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Dar valores a las propiedades del objeto mediante setters.
        persona.setEdad(20);
        persona.setNombre("Gustavo");
        persona.setTelefono(941884650);

        // Mostrar valores asignados previamente mediante getters.
        System.out.println("La edad de la persona es: " + persona.getEdad());
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("El teléfono de la persona es: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() { return this.edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getTelefono() { return this.telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
}
