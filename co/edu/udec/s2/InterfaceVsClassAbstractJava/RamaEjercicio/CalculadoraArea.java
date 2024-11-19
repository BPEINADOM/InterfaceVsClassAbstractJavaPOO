import Domain.Model.Figura;
import Domain.Model.Rectangulo;
import Domain.Model.Triangulo;

public class CalculadoraArea {

    public static void main(String[] args) {
        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las figuras
        Figura triangulo = new Triangulo(15, 20);
        Figura rectangulo = new Rectangulo(10, 14);

        // Mostrar el area de las figuras
        System.out.println("- Triangulo:");
        triangulo.mostrarArea();
        System.out.println("- Rectangulo:");
        rectangulo.mostrarArea();

        System.out.println("*********************************************");
    }
}
    

