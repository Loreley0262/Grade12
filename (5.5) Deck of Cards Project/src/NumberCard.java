public class NumberCard extends Cards{
    int value;

    NumberCard(int value, Suits suit){
        this.value = value;
        this.suit = suit;
    }

//    @Override
//    public int compareTo(NumberCard o) {
//        if (this.value> o.value){
//            return 1;
//        }
//        else if (this.value< o.value){
//            return -1;
//        }
//        return 0;
//    }

    public String toString(){
        return "\n" + value + " of " + suit;
    }
}
