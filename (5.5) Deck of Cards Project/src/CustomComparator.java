import java.util.Comparator;

public class CustomComparator implements Comparator<Cards> {
    int up = -1;
    int down = 1;
    int same = 0;

    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1 instanceof NumberCard && o2 instanceof NumberCard){
            if (o1.value > o2.value){
                return up;
            }
            return down;
        }
        else if (o1 instanceof FaceCard && o2 instanceof FaceCard){
            if (o1.face.faceVal> o2.face.faceVal){
                return down;
            }
                return up;
        }

        if (o1 instanceof FaceCard && o2 instanceof NumberCard){
            return down;
        }
        if (o1 instanceof NumberCard && o2 instanceof FaceCard){
            return up;
        }
        return same;
    }

}
