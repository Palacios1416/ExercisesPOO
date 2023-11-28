import java.util.Random;

public class Persona {
    String nombre;
    int edad;
    char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public boolean estaDisponible() {
        Random rand = new Random();
        // Simulamos un 20% de no disponibilidad
        return rand.nextDouble() > 0.2;
    }
}



