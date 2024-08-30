public class VehicleFactory {

    public Vehicle getInstance(VehicleType vehicleType){
        if(VehicleType.BIKE == vehicleType){
            return new Bike();
        } else if (VehicleType.CAR == vehicleType) {
            return new Car();
        } else if (VehicleType.TRUCK == vehicleType) {
            return new Truck();
        }
        else {
            throw new RuntimeException("Invalid vehicle type");
        }
    }
}
