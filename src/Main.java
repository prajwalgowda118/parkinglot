import parking.ParkingLevel;
import parking.ParkingLot;
import vehicle.VehicleClass;
import vehicle.car;
import vehicle.truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehicleClass car1 = new car("prajwalcar1");
        VehicleClass car2 = new car("prajwalcar2");
        VehicleClass truck1 = new truck("Truck1");
        VehicleClass truck2 = new truck("Truck2");

        ParkingLevel level1 = new ParkingLevel(1, 10);
        ParkingLevel level2 = new ParkingLevel(2, 10);

        ParkingLot lot1 = ParkingLot.getInstance();
        lot1.addLev(level1);
        lot1.addLev(level2);

        System.out.println("Parking car1: " + lot1.parkVehicle(car1));
        System.out.println("Parking car2: " + lot1.parkVehicle(car2));
        System.out.println("Parking truck1: " + lot1.parkVehicle(truck1));
        System.out.println("Parking truck2: " + lot1.parkVehicle(truck2));

        // Display the status of the parking lot
        lot1.display();

        // Unpark one vehicle
        System.out.println("Unparking car1: " + lot1.unPark(car1));

        // Display the status of the parking lot again
        lot1.display();

    }
}