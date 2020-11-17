package model;

public class Borrowing {
    String title;
    String id;

    public Borrowing(String id, String title){
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "id: " + id + " title: " + title;
    }
}
