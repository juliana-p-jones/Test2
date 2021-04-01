package assessment2;

import java.util.ArrayList;
import java.util.Collections;
public class VehicleApp {

        //static methods
    public static void printVehicleNamesAndPrices(Vehicle[] vehicles){
    for(Vehicle vehicle: vehicles){
        System.out.println(vehicle.getName() + " : " + vehicle.getPrice());
     }
    }

    public static void getSpeedOfDriveableVehicles(ArrayList<DriveAble> driveables){
    for(DriveAble driveable : driveables){
        System.out.println(driveable.milesPerHour());
        }
    }

    public static void sortAndPrintDriveableVehiclesBySpeed(ArrayList<DriveAble> unsortedDriveAbles){
        System.out.println("Before sorting by speed:");
        for (DriveAble vehicle : unsortedDriveAbles) {
            System.out.println(vehicle.milesPerHour());
        }
        Collections.sort(unsortedDriveAbles, new SpeedComparator());
        System.out.println("After sorting by speed:");
        for (DriveAble vehicle : unsortedDriveAbles) {
            System.out.println(vehicle.milesPerHour());
        }
    }


    public static void main(String[] args) {
        Engine truckEngine = new Engine(2);
        Engine carEngine = new Engine(4);
        Engine bikeEngine = new Engine(0);

        Car car = new Car("Honda Accord", 5, 50.0, carEngine, 100);
        Truck truck = new Truck("GM Truck", 5, 100.0, truckEngine, 75);
        MotorBike motorBike = new MotorBike("Suzuki Bike", 5,75.00, bikeEngine, 50);

        Vehicle[] vehicles = {car, truck, motorBike};
        ArrayList<DriveAble> driveAbles = new ArrayList<>();
        driveAbles.add(car); driveAbles.add(truck);


        //TEST
        System.out.println("Part One");
        printVehicleNamesAndPrices(vehicles);
        getSpeedOfDriveableVehicles(driveAbles);
        System.out.println("Part Two");
        System.out.println("======before tax======");
        car.totalBeforeTax(car);
        System.out.println("======after tax======");
        car.totalAfterTax(car);
        System.out.println("======before tax======");
        truck.totalBeforeTax(truck);
        System.out.println("======after tax======");
        truck.totalAfterTax(truck);
        sortAndPrintDriveableVehiclesBySpeed(driveAbles);
    }
}
