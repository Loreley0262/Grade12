public class Vehicle {
    public int registrationNumber;
    public Person owner;

    Vehicle(int registrationNumber, Person owner){
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    Vehicle(){                  //SHOULD BE ABLE TO REMOVE DEFAULT CONSTRUCTOR AND STILL WORK, BUT IT DOESN'T
        registrationNumber = 0;
        owner = null;
    }

    public void honk(){
        System.out.println("beep ima truck or a car");
    }

}
