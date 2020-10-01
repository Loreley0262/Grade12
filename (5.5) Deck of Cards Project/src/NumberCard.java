public class NumberCard extends Cards{

    NumberCard(int value, Suits suit){
        super(value, suit);
    }


    public String toString(){
        return "\n" + value + " of " + suit;
    }

}
