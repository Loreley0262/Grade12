package layouts;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import sample.DatabaseHandler;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Withdrawal implements Initializable {
    static DatabaseHandler handler;
    public ListView listBooks;
    public Button btnSubmit;
    public ListView listMembers;
    public TextField getMemberName;
    public TextField getBookTitle;
    public Button btnShow;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();

    }


    public void withdrawBook(ActionEvent actionEvent) {
        String name = getMemberName.getText();
        String title = getBookTitle.getText();

        boolean flag = name.isEmpty() || title.isEmpty();
        if (flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }



        String st = "INSERT INTO WITHDRAWAL VALUES (" +
                "'" + name + "'," +
                "'" + title + "'" + ")";
        System.out.println(st);
        if(handler.execAction(st)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saved");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error with imputing data");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }

    public void show(ActionEvent actionEvent) throws SQLException {
        String qu = "SELECT * FROM MEMBER";
        String qq = "SELECT * FROM BOOK";
        ResultSet rs = handler.execQuery(qu);
        while (rs.next()){
            String name = rs.getString("name");
            String id = rs.getString("id");
            String email = rs.getString("email");
            String nick = rs.getString("nickName");
            members.add(new Showmembers.Member(name, id, email, nick));
        }
        memberTable.getItems().setAll(members);
        System.out.println("load");
        btnShow.setVisible(false);
    }
}
