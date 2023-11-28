import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SalaCine sala = new SalaCine(8, 9);

        // Crear una película y reproducirla
        Pelicula pelicula = new Pelicula("El Gran Cine", 120, 13, "Director A", 10.0);
        sala.reproducirPelicula(pelicula);

        // Solicitar información al usuario para vender una entrada
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese la cantidad de dinero que trae: ");
        double dinero = scanner.nextDouble();

        // Solicitar asiento al usuario
        System.out.println("Escoja su asiento (por ejemplo, A1): ");
        String asientoSeleccionado = scanner.next().toUpperCase();
        char fila = asientoSeleccionado.charAt(0);
        int numero = Integer.parseInt(asientoSeleccionado.substring(1));

        Asiento asiento = sala.asientos.get(fila - 'A').get(numero - 1);

        // Vender entrada
        sala.venderEntrada(asiento, dinero, edad);

        scanner.close();


    //     SalaCine sala = new SalaCine(8, 9);

    //     // Crear una película y reproducirla
    //     Pelicula pelicula = new Pelicula("El Gran Cine", 120, 13, "Director A", 10.0);
    //     sala.reproducirPelicula(pelicula);

    //     // Crear espectadores aleatorios y vender entradas
    //     for (int i = 0; i < 15; i++) {
    //         Espectador espectador = generarEspectadorAleatorio();
    //         Asiento asiento = obtenerAsientoAleatorio(sala);
    //         sala.venderEntrada(asiento, espectador.dinero, espectador.edad);
    //     }
    // }

    // private static Espectador generarEspectadorAleatorio() {
    //     Random random = new Random();
    //     String[] nombres = {"Juan", "Maria", "Pedro", "Laura", "Carlos", "Ana"};
    //     String nombre = nombres[random.nextInt(nombres.length)];
    //     double dinero = 5 + random.nextDouble() * 15; // Dinero entre 5 y 20
    //     int edad = 10 + random.nextInt(30); // Edad entre 10 y 40
    //     return new Espectador(nombre, dinero, edad);
    // }

    // private static Asiento obtenerAsientoAleatorio(SalaCine sala) {
    //     Random random = new Random();
    //     int fila = random.nextInt(sala.asientos.size());
    //     int columna = random.nextInt(sala.asientos.get(fila).size());
    //     return sala.asientos.get(fila).get(columna);
    }
}
