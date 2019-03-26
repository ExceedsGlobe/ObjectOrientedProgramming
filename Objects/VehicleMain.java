package Objects;

public class VehicleMain {
//Level 3 and more efficient
    public static void main(String args[]){
        //Setting the fields via constructor while creating the object
        Vehicle obj=new Vehicle("Car",160,false);
        //Getting the value
        String vehicleType=obj.getVehicleType();
        int maxSpeed=obj.getMaxSpeed();
        boolean checkGear=obj.getIsGeared();
        //Printing
        System.out.println("Vehicle type "+vehicleType);
        System.out.println("Vehicle Max Speed "+maxSpeed);
        System.out.println("Vehicle is Geared "+checkGear);
        System.out.println("------------------------------");

        Vehicle objBike=new Vehicle("Bike",120,true);
        //Getting the value
        String vehicleType1=objBike.getVehicleType();
        int maxSpeed1=objBike.getMaxSpeed();
        boolean checkGear1=objBike.getIsGeared();
        //Printing
        System.out.println("Vehicle type "+vehicleType1);
        System.out.println("Vehicle Max Speed "+maxSpeed1);
        System.out.println("Vehicle is Geared "+checkGear1);
        System.out.println("------------------------------");


    }
}
