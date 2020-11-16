import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Showbooks implements Initializable {
    public TableColumn colMemberName;
    public TableColumn colMemberId;
    public TableColumn colBook;
    public TableColumn colBookId;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initCol();
//        try{
//            loadData();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
    }

    private void initCol() {
        colMemberName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colMemberId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colBook.setCellValueFactory(new PropertyValueFactory<>("email"));
        colBookId.setCellValueFactory(new PropertyValueFactory<>("nickName"));
        System.out.println("col");
    }
}
