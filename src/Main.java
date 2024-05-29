import parking.ParkingLevel;
import vehicle.VehicleClass;
import vehicle.car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehicleClass car1= new car("prajwalcar1");
        VehicleClass car2= new car("prajwalcar2");

        VehicleClass Truck1= new car("Truck1");
        VehicleClass Truck2= new car("Truck1");

       /* ParkingSpot spot1=new ParkingSpot(1);

        System.out.println(spot1.isAvailable());
        spot1.park(car1);
        System.out.println(spot1.isAvailable());
        System.out.println(spot1);
        spot1.unpark();
        System.out.println(spot1.isAvailable());*/

        ParkingLevel level1 = new ParkingLevel(1, 10);

        // Park the vehicles
        System.out.println("Parking car1: " + level1.parkVehicel(car1));
        System.out.println("Parking car2: " + level1.parkVehicel(car2));

        // Display the status of the parking level
        level1.display();

        // Unpark one vehicle
        System.out.println("Unparking car1: " + level1.unpark(car1));

        // Display the status of the parking level again
        //level1.display();

    }
}