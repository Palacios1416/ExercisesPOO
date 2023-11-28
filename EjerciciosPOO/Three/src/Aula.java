import java.util.ArrayList;
import java.util.List;
public class Aula {
    int identificador;
    int maxEstudiantes;
    String asignatura;
    Profesor profesor;
    List<Estudiante> estudiantes;

    public Aula(int identificador, int maxEstudiantes, String asignatura, Profesor profesor) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public boolean sePuedeDarClase() {
        int totalEstudiantes = estudiantes.size();
        int estudiantesPresentes = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.estaDisponible() && estudiante.calificacion >= 5.0) {
                estudiantesPresentes++;
            }
        }

        return profesor.estaDisponible() && totalEstudiantes > 0.5 * maxEstudiantes &&
                estudiantesPresentes > 0.5 * totalEstudiantes;
    }

    public void mostrarAprobados() {
        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.calificacion >= 5.0) {
                if (estudiante.sexo == 'M') {
                    aprobadasMujeres++;
                } else if (estudiante.sexo == 'H') {
                    aprobadosHombres++;
                }
            }
        }

        System.out.println("Aprobados hasta el momento:");
        System.out.println("Hombres: " + aprobadosHombres);
        System.out.println("Mujeres: " + aprobadasMujeres);
    }
}