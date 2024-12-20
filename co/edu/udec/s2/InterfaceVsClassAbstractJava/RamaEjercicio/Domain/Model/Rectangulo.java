package Domain.Model;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    // Constructor del rectangulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementacion para calcular el area
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
