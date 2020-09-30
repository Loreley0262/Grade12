public class NumberCard extends Cards{
    int value;
    int ace = 1;

    NumberCard(int value, Suits suit){
        this.value = value;
        this.suit = suit;
    }


    public String toString(){
        return "\n" + value + " of " + suit;
    }

    @Override
    public int compareTo(Cards o) {
        if (this.value>o.value){
            return up;
        }
        return down;
    }
}
