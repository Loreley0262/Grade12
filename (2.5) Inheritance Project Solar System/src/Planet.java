import java.util.ArrayList;


public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    Planet(){
        this.orbitTime = 11111;
        this.moons = new ArrayList<Moon>();
        this.designation = "planetNaem";
    }

    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getOrbitTime() {
        return orbitTime;
    }
    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }
    public ArrayList<Moon> getMoons() {
        return moons;
    }



    public void addMoon(Moon moon){
        moons.add(moon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet){
            Planet other = (Planet) obj;
            return this.orbitTime == other.orbitTime && this.designation.equals(other.designation);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Planet orbit time: " + getOrbitTime() + "\nPlanet designation: " + getDesignation() +
                "\nPlanet moon arraylist: " + moons;
    }
    

}
