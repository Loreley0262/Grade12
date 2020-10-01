public class Ileeahd implements Comparable<Ileeahd>{
    String word;
    int up = 1;
    int down = -1;
    int same = 0;


    Ileeahd(String word){
        this.word = word;
    }

    public String toString(){
        return word;
    }

    public boolean equals(Ileeahd s) {
        String firstString = this.toString().toLowerCase();
        String secondString = s.toString().toLowerCase();
        if (firstString.equals(secondString)){
            System.out.println("yes");
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    @Override
    public int compareTo(Ileeahd o) {
        return same;
    }
}
