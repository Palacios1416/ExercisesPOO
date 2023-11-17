import java.util.ArrayList;
import java.util.List;

public class SalaCine {
    List<List<Asiento>> asientos;
    Pelicula peliculaActual;

    public SalaCine(int filas, int columnas) {
        asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            List<Asiento> fila = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                fila.add(new Asiento((char) ('A' + i), j + 1));
            }
            asientos.add(fila);
        }
    }
    public void reproducirPelicula(Pelicula pelicula) {
        peliculaActual = pelicula;
    }

    public void venderEntrada(Asiento asiento, double dinero, int edad) {
        if (!asiento.ocupado && dinero >= peliculaActual.precioEntrada && edad >= 18) {
            System.out.println("Entrada vendida para la película: " + peliculaActual.titulo);
            asiento.ocupado = true;
        } else {
            System.out.println("No se puede vender la entrada para el asiento " + asiento.letra + asiento.numero);
        }
    }
}
