package practical;

class Vehicle { 
    int maxSpeed; String name;
    Vehicle() {
        maxSpeed = 200;
        name = "Tesla";
        System.out.println("Inside Vehicle's Constructor");
    }
    void displayVehicleName() {
        System.out.println("The name of the vehicle is: " + this.name);
    }
}


class TwoWheeler extends Vehicle {
    int maxSpeed;
    TwoWheeler(int maxSpeed, String name) {
        super();
        System.out.println("Inside TwoWheeler's Constructor"); this.maxSpeed = maxSpeed;
        this.name = name;
    }
    void display() {
        super.displayVehicleName();
        System.out.println("Max speed in Vehicle class is: " + super.maxSpeed); System.out.println("Current Max Speed is: " + maxSpeed);
    }
}

public class UsesOfSuper {
    public static void main(String[] args) {
        TwoWheeler activa = new TwoWheeler(100, "Activa"); 
        activa.display();
    }
}

