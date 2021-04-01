package assessment2;

public class Truck extends Vehicle implements DriveAble{
//vars
    Engine truckEngine;

    public final double TAX = .20;

//constructor
    public Truck(String name, int qty, double price, Engine truckEngine, int speed) {
        super(name, qty, price, truckEngine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double total = calcTax(vehicle) + (getPrice() * getQty());
        System.out.println(total);
    }
    public double calcTax(Vehicle vehicle){
        return getPrice() * TAX;
    }

    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    @Override
    public double getTAX() {
        return TAX;

    }
}
