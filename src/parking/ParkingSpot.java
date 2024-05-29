package parking;

import vehicle.VehicleClass;
import vehicle.VehicleType;

public class ParkingSpot {


    private int spotNumber;
    private VehicleClass vehicle;
    private VehicleType type;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.vehicle = null;
        this.type = VehicleType.CAR;
    }

    public VehicleType getType() {
        return type;
    }

    public VehicleClass getVehicle() {
        return vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
    public boolean isAvailable(){

        return vehicle==null;
    }
    public void park(VehicleClass vehi){

        if(isAvailable() && vehi.getType()==type){
            vehicle=vehi;
        }else{

            System.out.println("Vehicle is not parked , there is no slot available");
        }
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", vehicle=" + vehicle +
                ", type=" + type +
                '}';
    }

    public void unpark(){

        if(!isAvailable()){
            vehicle=null;
        }
        else
        {
            System.out.println("thers is no car to unpark");
        }

    }

}
