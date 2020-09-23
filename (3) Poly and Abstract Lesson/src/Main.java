import java.util.ArrayList;

//polymorphism is compiler checks what kind of obj is running the method, and runs correct version of method (like when overriding, methods).
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle(true));

        for (Vehicle v : vehicles){
            v.honk();
        }
    }
}

