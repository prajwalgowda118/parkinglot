package vehicle;

public class VehicleClass {


        protected String platenumber;
        protected VehicleType Vehtype;

        public VehicleClass(String platenumber, VehicleType  Vehtype){

            this.platenumber=platenumber;
            this.Vehtype=Vehtype;
        }
        public VehicleType getType() {
            return Vehtype;
        }

        public String getPlatenumber() {
            return platenumber;
        }

        @Override
        public String toString() {
            return "Vehicle{" +
                    "platenumber='" + platenumber + '\'' +
                    ", Vehtype=" + Vehtype +
                    '}';
        }




}
