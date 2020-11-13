package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public Button btnAddMember;
    public Button btnAddBook;
    public Button btnExit;
    public Button display;

    void loadWindow (String location, String title){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource(location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void addMemberWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/addmembers.fxml", "Add Member");
    }
    public void addBookWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/addbook.fxml", "Add Book");
    }
    public void displayWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/display.fxml", "List of Books");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Runs when window is open");
    }

    public void exitWindow(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}
