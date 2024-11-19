package Domain.Model;

import Domain.Model.Inferfaces.Nadador;
import Domain.Model.Inferfaces.Volador;

public class Pato implements Nadador, Volador {

    @Override
    public void nadar() {
        System.out.println("El Pato esta nadando.");
    }

    @Override
    public void volar() {
        System.out.println("El Pato esta volando.");
    }
}
