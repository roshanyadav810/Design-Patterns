public class Main {
    public static void main(String[] args) {
        System.out.println("starting the project");
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle1 = factory.getInstance(VehicleType.TRUCK);
        vehicle1.run();

        Vehicle vehicle2 = factory.getInstance(VehicleType.CAR);
        vehicle2.run();
    }
}
