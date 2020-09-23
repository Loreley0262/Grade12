public class Motorcycle extends  Vehicle{
    public boolean hasSideCar;

    Motorcycle(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Motorcycle){
            Motorcycle other = (Motorcycle) obj;
            if (this.owner.equals(other.owner)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Motorcycle, owner:  " + owner;
    }

    public void honk(){
        System.out.println("motorcycle goes vroom");
    }
}
