public class Motorcycle extends  Vehicle{
    public boolean hasSideCar;

    Motorcycle(int registrationNumber, Person owner, boolean hasSideCar){
        super(registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }

    public String toString(){
        return "Motorcycle, owner:  " + owner;
    }

    public void honk(){
        System.out.println("vroom motorcycle");
    }
}
