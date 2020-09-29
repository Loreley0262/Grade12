public class NumberCard extends Cards{
    int value;

    NumberCard(int value, Suits suit){
        this.value = value;
        this.suit = suit;
    }


    public String toString(){
        return "\n" + value + " of " + suit;
    }
}
