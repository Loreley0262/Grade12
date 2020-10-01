public class Ileeahd implements Comparable<Ileeahd>{
    int page;
    int up = 1;
    int down = -1;
    int same = 0;


    Ileeahd(int page){
        this.page = page;
    }

    public String toString(){
        return "toasty ring";
    }

    @Override
    public int compareTo(Ileeahd o) {
        if (this.page>o.page){
            return up;
        }
        return down;
    }
}
