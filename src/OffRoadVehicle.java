import Startegy.SportsDriveStartegy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStartegy());
    }
}
