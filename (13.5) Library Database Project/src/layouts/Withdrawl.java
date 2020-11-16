package layouts;

import javafx.fxml.Initializable;
import sample.DatabaseHandler;

import java.net.URL;
import java.util.ResourceBundle;

public class Withdrawl implements Initializable {
    static DatabaseHandler handler;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = DatabaseHandler.getHandler();
    }
}
