package Domain.Model;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor del traingulo
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementaciones de triangulo para calcular el area
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

}

