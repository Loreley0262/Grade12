public class FaceCard extends Cards{


    FaceCard(String person, Suits suit){
        this.person = person;
        this.suit = suit;
    }

//    @Override
//    public int compareTo(Cards o) {
//        if (this.person)
//            return 0;
//    }

    public String toString(){
        return "\n" + person + " of " + suit;
    }
}
