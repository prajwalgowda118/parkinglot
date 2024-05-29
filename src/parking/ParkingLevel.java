package parking;

import vehicle.VehicleClass;
import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {

    private int floor;
    private List<ParkingSpot> parkingSpots;

    public ParkingLevel(int floor, int numSpots) {
        this.floor = floor;
        parkingSpots = new ArrayList<>(numSpots);
        for (int i = 0; i < numSpots; i++) {
            parkingSpots.add(new ParkingSpot(i+1));
        }
    }
    public boolean parkVehicel(VehicleClass veh){

        for(ParkingSpot spot: parkingSpots){
            if(spot.isAvailable() && spot.getType()==veh.getType()){
                spot.park(veh);
                return true;
            }
        }
        return false;
    }
    public boolean unpark(VehicleClass veh){
        for(ParkingSpot spot: parkingSpots){
            if(!spot.isAvailable() && spot.getVehicle().equals(veh)){
                spot.unpark();
                return true;
            }
        }
        return false;
    }
   public void display(){
       System.out.println("Level " + floor + " Availability:");
       for (ParkingSpot spot : parkingSpots) {
           System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available" : "Occupied"));
       }
   }
}

