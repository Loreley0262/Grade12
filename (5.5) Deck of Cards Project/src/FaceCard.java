public class FaceCard extends Cards{
    String face;

    FaceCard(int value, Suits suit){
        super(value, suit);
        if (value == 11){
            face = "Jack";
        }
        if (value == 12){
            face = "Queen";
        }
        if (value == 13){
            face = "King";
        }
    }

    public String toString(){
        return "\n" + face + " of " + suit;
    }

}
