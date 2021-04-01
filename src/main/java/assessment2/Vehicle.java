package assessment2;

public abstract class Vehicle extends Product {
    private int qty;
    private double price;
    private Engine engine;
    private int speed;
    private final double TAX = .15;


    //constructor
    public Vehicle(String name, int qty, double price, Engine engine, int speed){
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }


    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
    public int getSpeed() {
        return speed;
    }

    public void totalBeforeTax(Vehicle vehicle){
        System.out.println((vehicle.getPrice() * getQty()));
    }
    public double calcTax(Vehicle vehicle){
        return getPrice() * TAX;
    }
    public abstract void totalAfterTax(Vehicle vehicle);
}
