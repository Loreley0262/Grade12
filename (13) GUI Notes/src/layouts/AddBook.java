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

public class AddBook implements Initializable {

    public DatabaseHandler handler;
    public TextField textId;
    public TextField textbook;
    public Button btnAddBook;


    public void addbook(ActionEvent actionEvent) {
        String id = textId.getText();
        String book = textbook.getText();

        boolean flag = id.isEmpty() || book.isEmpty();
        if (flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }

        String qu = "INSERT INTO BOOK VALUES("+
                "'" + id + "'," +
                "'" + book + "')";
        System.out.println(qu);
        if(handler.execAction(qu)){
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
        Stage stage = (Stage) btnAddBook.getScene().getWindow();
        stage.close();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();
    }
}
