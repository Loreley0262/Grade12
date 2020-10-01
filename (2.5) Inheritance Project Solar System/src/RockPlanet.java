public class RockPlanet  extends Planet{

    private boolean habitable;

    RockPlanet(int orbitTime, String designation, boolean habitable){
        setOrbitTime(orbitTime);
        setDesignation(designation);
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return habitable;
    }
    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString(){
        return "Rock planet orbit time: " + getOrbitTime() + "\nRock planet designation: " + getDesignation() + "\nRock planet habitable: " + habitable +
                "\nRock planet moon arraylist: " + getMoons();
    }
}
