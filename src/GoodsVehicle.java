import Startegy.NormalDriveStartegy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStartegy());
    }
}
