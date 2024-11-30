import Startegy.DriveStartegy;

public class Vehicle {
    DriveStartegy driveStartegy;

    public Vehicle(DriveStartegy driveStartegy) {
        this.driveStartegy = driveStartegy;
    }

    public void drive() {
        driveStartegy.drive();
    }
}
