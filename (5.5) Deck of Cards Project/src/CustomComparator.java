import java.util.Comparator;

public class CustomComparator implements Comparator<Cards> {
    int up = 1;
    int down = -1;
    int same = 0;

    @Override
    public int compare(Cards o1, Cards o2) {
        /*
        * o1 ace
        * o2 ace
        *
        * o1o2num
        * o1o2face
        *
        * */

        if (o1 instanceof FaceCard && o2 instanceof NumberCard){
            if (o1.face.faceVal>o2.value){
                return down;
            }
            return up;
        }
        if (o1 instanceof NumberCard && o2 instanceof FaceCard){
            if (o1.value>o2.face.faceVal){
                return up;
            }
            return down;
        }
        return same;
    }

}
