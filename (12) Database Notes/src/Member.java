public class Member {
    String name;
    String id;
    String nickname;
    String email;

    public Member(String id, String name, String email, String nickname) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "id: " + id + "\tname: " + name + "\tnickname: " + nickname + "\temail: " + email;
    }
}
