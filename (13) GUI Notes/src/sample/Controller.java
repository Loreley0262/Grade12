package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtNumber;
    public Label lblNumber;
    public ListView listPersons;
    public Button btnAddPerson;
    public TextField txtName;

    public void btnAddNums(ActionEvent actionEvent) {
        int nom = Integer.parseInt(txtNumber.getText()) + Integer.parseInt(lblNumber.getText());
        lblNumber.setText(Integer.toString(nom));
    }

    public void btnAddPpl(ActionEvent actionEvent) {
        Person joe = new Person(Integer.parseInt(txtNumber.getText()), txtName.getText());
        
    }
}
