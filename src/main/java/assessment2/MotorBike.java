package assessment2;

public class MotorBike extends Vehicle {
    //vars
    private int numOfWheels;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public MotorBike(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }

    public void totalAfterTax(Vehicle vehicle){

    }
}
