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

public class Showmembers implements Initializable {
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
        String qu = "SELECT * FROM MEMBER";
        ResultSet rs = handler.execQuery(qu);
        while (rs.next()){
            String name = rs.getString("name");
            String id = rs.getString("id");
            String email = rs.getString("email");
            String nick = rs.getString("nickName");
            members.add(new Showmembers.Member(name, id, email, nick));
        }
        memberTable.getItems().setAll(members);
        System.out.println("load");
    }

    private void initCol() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colNick.setCellValueFactory(new PropertyValueFactory<>("nickName"));
        System.out.println("col");
    }


    public static class Member{
        private final SimpleStringProperty name;
        private final SimpleStringProperty id;
        private final SimpleStringProperty email;
        private final SimpleStringProperty nick;

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
        public String getEmail() {
            return email.get();
        }
        public SimpleStringProperty emailProperty() {
            return email;
        }
        public void setEmail(String email) {
            this.email.set(email);
        }
        public String getNick() {
            return nick.get();
        }
        public SimpleStringProperty nickProperty() {
            return nick;
        }
        public void setNick(String nick) {
            this.nick.set(nick);
        }

        Member(String name, String id, String email, String nick){
            this.name = new SimpleStringProperty(name);
            this.id = new SimpleStringProperty(id);
            this.email = new SimpleStringProperty(email);
            this.nick = new SimpleStringProperty(nick);
        }
    }

    public DatabaseHandler handler;
    public TableView memberTable = new TableView();
    public TableColumn colName;
    public TableColumn colId;
    public TableColumn colEmail;
    public TableColumn colNick;
    public ObservableList<Member> members = FXCollections.observableArrayList();
}
