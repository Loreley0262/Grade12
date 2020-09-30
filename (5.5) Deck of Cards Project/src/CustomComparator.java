import java.util.Comparator;

public class CustomComparator implements Comparator<Cards> {
    @Override
    public int compare(Cards o1, Cards o2) {
        if (o1 instanceof NumberCard && o2 instanceof NumberCard){
            if (o1.value == 1 || o2.value ==1){
                return 1;
            }
            else if (o1.value> o2.value){
                return 1;
            }
            else if (o1.value< o2.value){
                return -1;
            }
            return 0;
        }
        if (o1 instanceof FaceCard && o2 instanceof FaceCard){
            if (o1.face.faceVal> o2.face.faceVal){
                return 1;
            }
            else if (o1.face.faceVal< o2.face.faceVal){
                return -1;
            }
            return 0;
        }
        if (o1 instanceof NumberCard && o2 instanceof FaceCard) {
                if ( o1.value ==1){
                    return 1;
                }
            else {
                    return -1;
                }
            }
        return 0;
        }

}
