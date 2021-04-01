package assessment2;

public class Truck extends Vehicle implements DriveAble{

    //vars
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

    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    public double calcTax(Vehicle vehicle){
        return getPrice() * TAX;
    }
}
