import parking.ParkingSpot;
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

        ParkingSpot spot1=new ParkingSpot(1,car1.getType());

        System.out.println(spot1.isAvailable());

    }
}