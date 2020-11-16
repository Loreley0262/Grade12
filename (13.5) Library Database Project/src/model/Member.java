package model;

public class Member {
    String name;
    String id;
    String nick;
    String email;

    public Member(String name, String id, String nick, String email){
        this.name = name;
        this.id = id;
        this.nick = nick;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tName: " + name;
    }
}
