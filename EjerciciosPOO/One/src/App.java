public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("::::::::Libros:::::::");

        Libro libro1 = new Libro("9781423103349", "Percy Jackson y el ladrón del rayo", "Rick Riordan", 384);
        Libro libro2 = new Libro("9788498386264", "Percy Jackson y el mar de los monstruos", "Rick Riordan", 304);

        libro1.mostrar();
        libro2.mostrar();

        // Indicar cuál de los dos libros tiene más páginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro '" + libro1.getTitulo() + "' tiene más páginas que el libro '" +
                    libro2.getTitulo() + "'.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro '" + libro2.getTitulo() + "' tiene más páginas que el libro '" +
                    libro1.getTitulo() + "'.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}
