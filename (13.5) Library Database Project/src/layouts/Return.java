package layouts;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Borrowing;
import sample.DatabaseHandler;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Return implements Initializable {
    static DatabaseHandler handler;
    public Button btnSubmit;
    public TextField getMemberId;
    public TextField getBookTitle;
    public ObservableList<Borrowing> borrowings = FXCollections.observableArrayList();
    public TableView bookTable;
    public TableView memberTable;
    public ObservableList<Return.Member> members = FXCollections.observableArrayList();
    public ObservableList<Return.Book> books = FXCollections.observableArrayList();

    public Label btnReturn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initCol();
        try{
            loadData();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void initCol() {
//        colBookId.setCellValueFactory(new PropertyValueFactory<>("id"));
//        colBookTitle.setCellValueFactory(new PropertyValueFactory<>("book"));
//        colMemberId.setCellValueFactory(new PropertyValueFactory<>("id"));
//        colMemberName.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
    private void loadData() throws SQLException {
        handler = DatabaseHandler.getHandler();
        String qu = "SELECT * FROM MEMBER";
        String qq = "SELECT * FROM BOOK";
        ResultSet rs = handler.execQuery(qu);
        ResultSet res = handler.execQuery(qq);
        while (rs.next()){
            String id = rs.getString("id");
            String name = rs.getString("name");
            if (rs.getString("hasbook").equals("false")){
                members.add(new Return.Member(id, name));
            }

        }
        while (res.next()){
            String id = res.getString("id");
            String book = res.getString("book");
            if (res.getString("borrowing").equals("false")){
                books.add(new Return.Book(id, book));
            }

        }
        memberTable.getItems().setAll(members);
        bookTable.getItems().setAll(books);
    }


    public void returnBook(ActionEvent actionEvent) throws SQLException {
        String id = getMemberId.getText();
        String title = getBookTitle.getText();
        System.out.println(id);
        System.out.println(title);
        boolean flag = id.isEmpty() || title.isEmpty();
        if (flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter all fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }

        String st = "UPDATE MEMBER \n" +
                "SET hasbook = 'false'\n" +
                "WHERE ID = '" + id + "'";
//UPDATE MEMBER SET hasbook = 'true' WHERE ID = 'a'

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

    }
    public static class Member{
        private final SimpleStringProperty id;
        private final SimpleStringProperty name;


        public String getName() {
            return name.get();
        }
        public SimpleStringProperty nameProperty() {
            return name;
        }
        public void setName(String name) {
            this.name.set(name);
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

        Member(String id, String name) {
            this.id = new SimpleStringProperty(id);
            this.name = new SimpleStringProperty(name);
        }

    }

    public static class Book{
        private final SimpleStringProperty id;
        private final SimpleStringProperty book;

        public String getBook() {
            return book.get();
        }
        public SimpleStringProperty bookProperty() {
            return book;
        }
        public void setBook(String title) {
            this.book.set(title);
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

        Book(String id, String book){
            this.id = new SimpleStringProperty(id);
            this.book = new SimpleStringProperty(book);
        }
    }
}
