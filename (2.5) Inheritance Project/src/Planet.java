import java.util.ArrayList;
import java.util.List;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    Planet(){
        this.orbitTime = 11111;
        //this.moons.add()
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

    public List<Moon> getMoons(){
        return moons;
    }

    public void add(Moon moon){
        moons.add(moon);
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }



}
