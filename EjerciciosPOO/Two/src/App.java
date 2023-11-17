import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double a,b,c;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        System.out.println(":::::::Raices:::::::");
        while (count < 3) {
            try {
                System.out.println("Ingrese el valor de a: ");
                a=scanner.nextDouble();
                System.out.println("Ingrese el valor de b: ");
                b=scanner.nextDouble();
                System.out.println("Ingrese el valor de c: ");
                c=scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("no puede ingresar valores no numericos");
                scanner.nextLine();
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Demasiados intentos, cerrando programa.");
        } else {
            Raices ecuacion = new Raices(a, b, c);
            ecuacion.mostrarDiscriminante();
            ecuacion.calcular();
        }
        
    }
}
