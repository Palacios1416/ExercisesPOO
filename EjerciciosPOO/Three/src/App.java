import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static String nombreProfesor, asignatura;
    public static int edadProfesor, count, numAsignatura;
    public static char generoProfesor;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nombreEstudiantes[] = new String[5];
        int edadEstudiantes[] = new int[5]; 
        char generoEstudiantes[] = new char[5];
        double calificacion[] = new double[5];

        System.out.println("Ingrese el nombre del docente: ");
        nombreProfesor = scanner.nextLine();

        System.out.println("Ingrese la edad del docente: ");
        while (count < 3) {
            try {
                        do {
                           edadProfesor = scanner.nextInt();
                            if ((edadProfesor < 1 || edadProfesor > 70) && count < 3) {
                                System.out.println("El valor ingresado no es una edad valida");
                                System.out.println("Ingrese la edad del docente otra vez: ");
                                count++;
                            }
                            if (count == 3) {
                                break;
                            }
                        } while ((edadProfesor < 1 || edadProfesor > 70) && count != 3 );
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("No puede ingresar un valor no numerico.");
                        count++;
            }
        }
        if(count == 3){
            System.out.println("Demasiados intentos, el programa termino");
        }

        System.out.println("Ingrese el genero del docente (H) o (M)");
        generoProfesor = scanner.next().charAt(0);

        System.out.println("¿Que asignatura imparte?\n"+
                            "1. Introduccion a la programacion\n"+
                            "2. Ingenieria de software\n"+
                            "3. Sistemas operativos de redes");
        numAsignatura = scanner.nextInt();

        if (numAsignatura == 1) {
            asignatura = "Introduccion a la programacion";
        } else if(numAsignatura == 2){
            asignatura = "Ingenieria de software";
        } else if(numAsignatura == 3){
            asignatura = "Sistemas operativos de redes";
        }

        Profesor profesor = new Profesor(nombreProfesor, edadProfesor, generoProfesor, asignatura);

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Estudiante 1", 20, 'H', 8.5));
        estudiantes.add(new Estudiante("Estudiante 2", 22, 'M', 6.0));
        estudiantes.add(new Estudiante("Estudiante 3", 21, 'H', 4.0));
        estudiantes.add(new Estudiante("Estudiante 4", 23, 'M', 7.5));

        Aula aula = new Aula(1, 20, "Introducción a la Programación", profesor);
        aula.estudiantes.addAll(estudiantes);

        if (aula.sePuedeDarClase()) {
            System.out.println("Se puede dar clase en el aula " + aula.identificador);
            aula.mostrarAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula " + aula.identificador);
        }


        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < 3; i++) { //tres maestros porque son 3 materias
            // System.out.println("Ingrese el nombre del docente#"+i);
            // System.out.println("Ingrese la edad del docente#"+i);
            // System.out.println("Ingrese el genero del docente#"+i);
        // }

        // System.out.println("Que asignatura imparte?\n"+
        //                     "1. Introduccion a la programacion\n"+
        //                     "2. Ingenieria de software\n"+
        //                     "3. Sistemas operativos de redes");
        // int asignatura = scanner.nextInt();

        // System.out.println("cuantos estudiantes hay?");
        // int cantidadEstudiantes = scanner.nextInt();
        // switch (asignatura) {
        //     case 1:
        //         for (int i = 0; i < cantidadEstudiantes; i++) { 
        //             System.out.println("Ingrese el nombre del estudiante#"+i);
        //             System.out.println("Ingrese la edad del estudiante#"+i);
        //             System.out.println("Ingrese el genero del estudiante#"+i);
                    
        //         }
        //         //System.out.println("Ingrese su calificacion actual entre 0 y 10");
        //         break;
        //     case 2:
                
        //         break;
        //     case 3:
                
        //         break;
        // }
        
    }
}
