package layouts;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.DatabaseHandler;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Showbooks implements Initializable {
    public DatabaseHandler handler;
    public TableColumn colTitle;
    public TableColumn colId;
    public ObservableList<Showbooks.Book> book = FXCollections.observableArrayList();
    public TableView bookTable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initCol();
        try{
            loadData();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void loadData() throws SQLException {
        handler = DatabaseHandler.getHandler();
        String qu = "SELECT * FROM BOOK";
        ResultSet rs = handler.execQuery(qu);
        while (rs.next()){
            String id = rs.getString("id");
            String title = rs.getString("book");
            book.add(new Showbooks.Book(id, title));
        }
        bookTable.getItems().setAll(book);
        System.out.println("load");
    }

    private void initCol() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("book"));
        System.out.println("col");
    }

    public static class Book{
        private final SimpleStringProperty id;
        private final SimpleStringProperty title;


        public String getTitle() {
            return title.get();
        }
        public SimpleStringProperty titleProperty() {
            return title;
        }
        public void setTitle(String title) {
            this.title.set(title);
        }
        public String getId() {
            return id.get();
        }
        public SimpleStringProperty idProperty() {
            return id;
        }
        public void setId(String id) {
            this.id.set(id);
        }

        Book(String id, String title){
            this.id = new SimpleStringProperty(id);
            this.title = new SimpleStringProperty(title);
        }
    }
}
