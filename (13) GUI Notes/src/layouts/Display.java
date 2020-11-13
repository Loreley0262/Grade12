package layouts;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import sample.DatabaseHandler;

import javax.xml.transform.Result;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ResourceBundle;

public class Display implements Initializable {
    static DatabaseHandler handler;
    public ListView listMembers = new ListView();
    public ListView listBooks;
    public Button btnShow;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String qu = "SELECT * FROM MEMBER";
        ResultSet rs = handler.execQuery(qu);

        while (true) {
            try {
                if (!rs.next()) break;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            String name = null;
            try {
                name = rs.getString("name");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
//            String id = rs.getString("id");
//            String nickname = rs.getString("nickname");
//            String email = rs.getString("email");
            listMembers.getItems().add(name);
        System.out.println("run");
        }


//        public static void printMembers () throws SQLException {
//            ArrayList<Member> members = new ArrayList<>();
//            String qu = "SELECT * FROM MEMBER"; //change select to delete to delete member
//            ResultSet rs = handler.execQuery(qu);
//
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String id = rs.getString("id"); //single quotes for sql? idk what that means
//                String nickname = rs.getString("nickname");
//                String email = rs.getString("email");
//                members.add(new Member(id, name, email, nickname));
//            }
//
//            Iterator<Member> iterator = members.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//        }
//    }
//
//    //public void printMembers(ActionEvent actionEvent) throws SQLException {
//        ArrayList<Member> members = new ArrayList<>();
//            String qu = "SELECT * FROM MEMBER"; //change select to delete to delete member
//            ResultSet rs = handler.execQuery(qu);
//
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String id = rs.getString("id"); //single quotes for sql? idk what that means
//                String nickname = rs.getString("nickname");
//                String email = rs.getString("email");
//                members.add(new Member(id, name));
//            }
//
//            Iterator<Member> iterator = members.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
        }

    public void printMembers(ActionEvent actionEvent) {
        System.out.println("hi");
    }
}

