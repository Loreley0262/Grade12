public class FaceCard extends Cards{

    FaceCard(FaceTest face, Suits suit){
        this.face = face;
        this.suit = suit;
    }

//    @Override
//    public int compareTo(Cards o) {
//        if (this.person)
//            return 0;
//    }

    public String toString(){
        return "\n" + face + " of " + suit;
    }

    @Override
    public int compareTo(Cards o) {
        if (this.face.faceVal>o.face.faceVal){
            return up;
        }
        return down;
    }
}
