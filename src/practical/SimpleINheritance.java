package practical;

class Vehicles {
    int numberOfWheels; 
    String engineType;
}

class TwoWheelers extends Vehicles { 
    TwoWheelers() {
        numberOfWheels = 2;
        engineType = "2 Stroke SI";
    }
}

public class SimpleINheritance {
    public static void main(String[] args) { TwoWheelers activa = new TwoWheelers();
    System.out.println("Number of wheels: " + activa.numberOfWheels); System.out.println("Type of Engine: " + activa.engineType);
    }
}

    