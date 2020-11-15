package layouts;

public class Book {
    String title;
    String id;

    Book (String id, String title){
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "id: " + id + " title: " + title;
    }
}
