package Objects;

public class Vehicle {
    //We use a constructor instead of setter methods
    String type;
    private int maxSpeed;
private boolean isGeared;


    public Vehicle(String vehicletype,int maxSpeed,boolean isGeared){
        this.type=vehicletype;
        this.maxSpeed=maxSpeed;
        this.isGeared=isGeared;

    }

    public String getVehicleType() {
        return type;
    }

    public boolean getIsGeared() {
        return isGeared;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
