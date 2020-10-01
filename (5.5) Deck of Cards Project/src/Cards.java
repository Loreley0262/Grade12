public abstract class Cards implements Comparable<Cards>{
    int value;
    Suits suit;
    int up = -1;
    int down = 1;
    int same = 0;

    Cards(int value, Suits suit){
        this.value = value;
        this.suit = suit;
    }

    public Suits getSuit() {
        return suit;
    }

    public int getSuitVal() {
        return suit.suitVal;
    }

    @Override
    public int hashCode() {
        return suit.suitVal + value;
    }

    @Override
    public int compareTo(Cards o) {
        if (this.value < o.value) {
            return 1;
        }

        else if (this.value > o.value) {
            return -1;
        }
        return 0;
    }
}
