public class Shift {
    char[] alfa = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int shift;

    Shift(int shift){
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Shift = " + shift;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shift){
            Shift other = (Shift) obj;
            if (this.shift == other.shift){
                return true;
            }
        }
        return false;
    }
}
