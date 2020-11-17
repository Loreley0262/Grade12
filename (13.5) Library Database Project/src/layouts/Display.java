package layouts;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Display {
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
    public void showMembersWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/showmembers.fxml", "title");
    }
    public void showBookWindow(ActionEvent actionEvent) {
        loadWindow("../layouts/showbooks.fxml", "title");
    }



}
