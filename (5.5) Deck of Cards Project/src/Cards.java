import java.util.Comparator;

public abstract class Cards implements Comparator<Cards> {
    Suits suit;
    int value;
    String person;

    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1.value> o2.value){
            return 1;
        }
        else if (o1.value< o2.value){
            return -1;
        }
        return 0;
    }

    //    public int compareTo(Cards o) {
//
//    }
}
