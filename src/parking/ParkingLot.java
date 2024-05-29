package parking;

import vehicle.VehicleClass;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot instance;
    private final List<ParkingLevel> levels;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLev(ParkingLevel level) {
        levels.add(level);
    }

    public List<ParkingLevel> getLevels() {
        return levels;
    }

    public boolean parkVehicle(VehicleClass Vehicle){

        for(ParkingLevel spot: levels){
            if(spot.parkVehicel(Vehicle)){
                //spot.park(veh);
                return true;
            }
        }
        System.out.println("No available spots for vehicle type: " +Vehicle.getType());

        return false;
    }
    public boolean unPark(VehicleClass Vehicle){

        for(ParkingLevel spot: levels){
            if(spot.parkVehicel(Vehicle)){
                //spot.park(veh);
                return true;
            }
        }
        return false;
    }
    public void display(){
        for (ParkingLevel level : levels) {
            level.display();
        }
    }
}
