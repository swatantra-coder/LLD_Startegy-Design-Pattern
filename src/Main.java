public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new OffRoadVehicle();
        Vehicle vehicle2 = new GoodsVehicle();
        Vehicle vehicle3 = new SportsVehicle();
        vehicle.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}