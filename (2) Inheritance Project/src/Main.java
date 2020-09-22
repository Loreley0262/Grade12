public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.honk();
        Motorcycle motor = new Motorcycle(10, new Person(), true);
        motor.honk();

        if(myVehicle instanceof Car){
            Car newCar = (Car) myVehicle;
        }
        else if (myVehicle instanceof Truck){
            Truck myTruck = (Truck) myVehicle;
        }
    }
}


// DIAGRAM OPTION (SHOW DIAGRAM) ONLY IN ULTIMATE EDITION, NOT COMMUNITY