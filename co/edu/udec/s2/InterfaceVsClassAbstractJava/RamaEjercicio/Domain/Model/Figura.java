package Domain.Model;

public abstract class Figura {

    public abstract double calcularArea();

    // Metodo abstracto para el area de las figuras
    public void mostrarArea() {
        System.out.println("El area de la figura es: " + calcularArea());
    }

}
