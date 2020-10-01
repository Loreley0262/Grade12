public class Ileeahd implements Comparable<Ileeahd>{
    int page;
    int chap;

    Ileeahd(int page){
        this.page = page;
    }

    public String toString(){
        return "toasty ring";
    }

    @Override
    public int compareTo(Ileeahd o) {
        if (this.page>o.page){
            return 1;
        }
        return -1;
    }
}
