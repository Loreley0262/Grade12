package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    public Button btnClearMemberTable;
    public Button btnClearBookTable;
    public DatabaseHandler handler;

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
    public void showDisplayWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/display.fxml", "title");
    }
    public void showWithdrawOrReturnWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/withdrawOrReturn.fxml", "title");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();
        System.out.println("Runs when window is open");
    }


    public void clearMemberTable(ActionEvent actionEvent) {
        String st = "DELETE FROM MEMBER";

        System.out.println("MEMBER table cleared.");
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

    public void clearBookTable(ActionEvent actionEvent) {
        String st = "DELETE FROM BOOK";

        System.out.println("BOOK table cleared.");
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

}
