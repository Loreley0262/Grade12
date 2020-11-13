package layouts;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import sample.DatabaseHandler;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ResourceBundle;

public class Display implements Initializable {
    public DatabaseHandler handler;
    public ListView listMembers = new ListView();
    public ListView listBooks;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<Member> members = new ArrayList<>();
        String qu = "SELECT * FROM MEMBER";
        listMembers.getItems().add(qu);
        try{
            ResultSet rs = handler.execQuery(qu);
            while (rs.next()){
                String name = rs.getString("name");
                String id = rs.getString("id"); //single quotes for sql? idk what that means
                listMembers.getItems().add(name);
            }
        }
        catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

//    public static void printMembers() throws SQLException {
//        ArrayList<Member> members = new ArrayList<>();
//        String qu = "SELECT * FROM MEMBER"; //change select to delete to delete member
//        ResultSet rs = handler.execQuery(qu);
//
//        while (rs.next()){
//            String name = rs.getString("name");
//            String id = rs.getString("id"); //single quotes for sql? idk what that means
//            String nickname = rs.getString("nickname");
//            String email = rs.getString("email");
//            members.add(new Member(id, name, email, nickname));
//        }
//
//        Iterator<Member> iterator = members.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }

}
