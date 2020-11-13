package layouts;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseHandler;

import javax.xml.soap.Text;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AddMember implements Initializable {

    public DatabaseHandler handler;
    public TextField getNick;
    public TextField getEmail;
    public TextField getId;
    public TextField getName;
    public Button btnSubmit;
    String id;
    String name;

    AddMember(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();
    }

    @Override
    public String toString() {
        return name;
    }

    public void addMember(ActionEvent actionEvent) {
        String name = getName.getText();
        String id = getId.getText();
        String email = getEmail.getText();
        String nick = getNick.getText();

        boolean flag = name.isEmpty() || id.isEmpty() || email.isEmpty() || nick.isEmpty();
        if (flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        String st = "INSERT INTO MEMBER VALUES (" +
                "'" + id + "'," +
                "'" + name + "'," +
                "'" + email + "'," +
                "'" + nick + "'" + ")";
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
        Stage stage = (Stage) btnSubmit.getScene().getWindow();
        stage.close();
    }

}
