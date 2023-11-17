public class Raices {
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Metodo para obtener las dos posibles soluciones
    public void obtenerRaices() {
        double discriminante = calcularDiscriminante();

        if (tieneRaices()) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las dos posibles soluciones son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }

    // Metodo para obtener una única raíz
    public void obtenerRaiz() {
        double discriminante = calcularDiscriminante();

        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("La única raíz es: " + raiz);
        } else {
            System.out.println("No tiene solución única real.");
        }
    }

    // Metodo para mostrar el discriminante
    public double mostrarDiscriminante() {
        double discriminante = calcularDiscriminante();
        System.out.println("El discriminante es: " + discriminante);
        return discriminante;
    }

    // Metodo para verificar si tiene dos soluciones reales
    public boolean tieneRaices() {
        double discriminante = calcularDiscriminante();
        return discriminante > 0;
    }

    // Metodo para verificar si tiene una única solución real
    public boolean tieneRaiz() {
        double discriminante = calcularDiscriminante();
        return discriminante == 0;
    }

    // Metodo para calcular las soluciones
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }

    // Metodo privado para calcular el discriminante
    private double calcularDiscriminante() {
        return b * b - 4 * a * c;
    }

}
