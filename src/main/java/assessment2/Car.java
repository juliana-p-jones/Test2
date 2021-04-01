package assessment2;

public class Car extends Vehicle implements DriveAble {
    //constructor
    public Car(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double total =calcTax(vehicle) + (getPrice() * getQty());
        System.out.println(total);
    }
}
