package layouts;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class Addbook implements Initializable{

    static DatabaseHandler handler;
    public TextField getId;
    public TextField getTitle;
    public Button btnSubmit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();
    }


    public void addBook(ActionEvent actionEvent) {
        String title = getTitle.getText();
        String id = getId.getText();


        boolean flag = title.isEmpty() || id.isEmpty();
        if (flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        String st = "INSERT INTO BOOK VALUES (" +
                "'" + id + "'," +
                "'" + title + "'," +
                "'false'" + ")";
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