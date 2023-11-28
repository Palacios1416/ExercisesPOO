class Profesor extends Persona {
    String asignatura;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        super(nombre, edad, sexo);
        this.asignatura = asignatura;
    }

    @Override
    public boolean estaDisponible() {
        // En el caso del profesor, la disponibilidad es manejada de manera diferente
        // Puedes implementar tu lógica específica aquí.
        // Por simplicidad, asumiremos que siempre está disponible.
        return true;
    }
}