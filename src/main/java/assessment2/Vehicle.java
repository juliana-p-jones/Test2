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
    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getTAX() {
        return TAX;
    }


    public void totalBeforeTax(Vehicle vehicle){
        System.out.println((getPrice() * getQty()));
    }
    public double calcTax(Vehicle vehicle){
        return getPrice() * TAX;
    }
    public abstract void totalAfterTax(Vehicle vehicle);



}
