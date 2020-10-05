public class OrigText implements Comparable{
    String origWord;
    int up = 1;
    int down = -1;
    int same = 0;

    OrigText(String origWord){
        this.origWord = origWord;
    }

    @Override
    public String toString() {
        return "Original Text = " + origWord;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof OrigText){
            OrigText other = (OrigText) o;
            if (this.origWord.equals(other.origWord)){
                return up;
            }
        }
        return down;
    }

    public char[] toCharArray(String s) {
        return s.toCharArray();
    }
}
