import java.util.Random;
import java.util.Scanner;

public class App {
    public static int count, edad;
    public static double dinero;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SalaCine sala = new SalaCine(8, 9);

        Pelicula pelicula = new Pelicula("El Gran Cine", 120, 13, "Director A", 10.0);
        sala.reproducirPelicula(pelicula);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");

        while (count < 3) {
                try {
                    do {
                       edad = scanner.nextInt();
                        if ((edad < 1 || edad > 3) && count < 3) {
                            System.out.println("El valor ingresado no es logico");
                            System.out.println("Ingrese su edad otra vez: ");
                            count++;
                        }
                        if(count == 3){
                            break;
                        }
                    } while ((edad < 1 || edad > 3) && count != 3);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("No puede ingresar un valor no numerico.");
                    count++;
                }
            }
            if(count == 3){
                    System.out.println("Demasiados intentos, el programa termino");
            }

        System.out.println("Ingrese su sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese la cantidad de dinero que trae: ");

        while (count < 3) {
            			try {                
                			do {
                    				dinero = scanner.nextDouble();
                    			if (dinero <= 0) {
                                		System.out.println("Necesita mas dinero");
                                		System.out.print("Si se equivoco, ingrese la cantidad de dinero que trae otra vez: ");
                            		}
                			} while (dinero <= 0);
                		break;
            			} catch (InputMismatchException e) {
                			System.out.println("Valor incorrecto, intente nuevamente.");
                			scanner.nextLine();
                			count++;
            			}
        		}
        		if(count == 3){
            			System.out.println("Se agotaron los intentos.");
        		}else {
            			cuenta.depositar(cantidadDeposito);        
			    }

        System.out.println("Escoja su asiento (por ejemplo, A1): ");
        String asientoSeleccionado = scanner.next().toUpperCase();
        char fila = asientoSeleccionado.charAt(0);
        int numero = Integer.parseInt(asientoSeleccionado.substring(1));

        Asiento asiento = sala.asientos.get(fila - 'A').get(numero - 1);

        // Vender entrada
        sala.venderEntrada(asiento, dinero, edad);

        scanner.close();



    //     // se crea una pelicula y la reproduce
    //     Pelicula pelicula = new Pelicula("El Gran Cine", 120, 13, "Director Guillermo del toro", 10.0);
    //     sala.reproducirPelicula(pelicula);

    //     // espectadores aleatorios y se vende entradas
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
