import java.util.ArrayList;


public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moonList;
    private String designation;

    Planet(){
        this.orbitTime = 11111;
        this.moonList = new ArrayList<Moon>();
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
    public ArrayList<Moon> getMoonList() {
        return moonList;
    }
    public void setMoonList(ArrayList<Moon> moonList) {
        this.moonList = moonList;
    }



    public void addMoon(Moon moon){
        moonList.add(moon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet){
            Planet other = (Planet) obj;
            if (this.orbitTime == other.orbitTime){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Planet orbit time: " + getOrbitTime() + "\nPlanet designation: " + getDesignation() +
                "\nPlanet moon arraylist: " + moonList;
    }
    

}
