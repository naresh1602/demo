// First interface
interface Drivable {
    void drive();
}

// Second interface
interface Flyable {
    void fly();
}

// Class implementing both interfaces
class Vehicle implements Drivable, Flyable {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name + " is being driven");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}

// Testing the implementation
public class Automobile {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car");
        car.drive();

        Vehicle helicopter = new Vehicle("Helicopter");
        helicopter.fly();
    }
}
