import java.util.Comparator;

public class CustomComparator implements Comparator<Cards> {
    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1 instanceof NumberCard){
            if (o1.value> o2.value){
                return 1;
            }
            else if (o1.value< o2.value){
                return -1;
            }
            return 0;
        }


        return 0;
    }
}
