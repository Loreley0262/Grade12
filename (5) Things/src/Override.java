public class Override {

    //used more in sets, grouping objs in set
    //rules
        //must be consistent, and return same int unless info in equals method changes
        //if obj are equal according to equals method, must return same int
        //if obj not equal according to equals method, can but doesn't have to return same int
    //
    @java.lang.Override
    public int hashCode() {
        return super.hashCode();
    }



//    @java.lang.Override
//    public boolean equals(Object obj) {
//        if (obj instanceof person){
//            person.other = (person)obj;
//            if (other.equals(obj)){
//                return true;
//            }
//        }
//        return false;
//    }


    @java.lang.Override
    public String toString() {
        return "Person ID";
    }
}
