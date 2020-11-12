package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Controller {


    public Button btnAddMember;
    public Button btnDelMember;

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

    public void addMemberWindow(javafx.event.ActionEvent actionEvent) {
        loadWindow("../Layout/addmember.fxml", "Add Member");
    }

    public void delMemberWindow(ActionEvent actionEvent) {
         loadWindow("../Layout/delmember.fxml", "Del Member");
    }
}
