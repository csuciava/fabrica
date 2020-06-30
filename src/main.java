import model.Factory;
import model.Model;

public class main {
    public static void main( String[] args) {
        System.out.println("model");

        Model Sandero = new Model("Sandero");
        Sandero.addEngineType("benzină");
        Sandero.addMotorisation(900);

        Factory Brasov = new Factory("FabricaUnu","Romania");
        Brasov.addProducedModel(Sandero);


    }
}
