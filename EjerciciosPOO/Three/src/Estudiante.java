import java.util.Random;
class Estudiante extends Persona {
    double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }

    @Override
    public boolean estaDisponible() {
        Random rand = new Random();
        // Simulamos un 50% de faltas a clases
        return rand.nextDouble() > 0.5;
    }
}
