import Startegy.SportsDriveStartegy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStartegy());
    }
}
