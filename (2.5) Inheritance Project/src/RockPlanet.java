public class RockPlanet  extends Planet{

    private boolean habitable;

    RockPlanet(int orbitTime, String designation, boolean habitable){
//        this.orbitTime = orbitTime;
//        this.designation = designation;
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return habitable;
    }
    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
