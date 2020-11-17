package sample;

import javax.swing.*;
import java.sql.*;


public class DatabaseHandler {
    private static final String DB_url = "jdbc:derby:database/forum;create=true";
    private static Connection conn = null;
    private static Statement stmt = null;
    public static DatabaseHandler handler = new DatabaseHandler();

    public static DatabaseHandler getHandler(){return handler;}

    public DatabaseHandler(){
        createConnection();
        createMemberTable();
        createBookTable();
        createWithdrawTable();
    }



    private void createConnection(){ //must use try catch statements
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection(DB_url);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private void createMemberTable(){
        String TABLE_NAME = "MEMBER";
        try{
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()){
                System.out.println("Table " + TABLE_NAME + " already exists.");
            }
            else{
                String statement = "CREATE TABLE " + TABLE_NAME +"(" +
                        "id varchar (200) primary key, \n" +
                        "name varchar (200), \n" +
                        "email varchar (200), \n" +
                        "nickName varchar (200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    private void createBookTable(){
        String TABLE_NAME = "BOOK";
        try{
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()){
                System.out.println("Table " + TABLE_NAME + " already exists.");
            }
            else{
                String statement = "CREATE TABLE " + TABLE_NAME +"(" +
                        "id varchar (200) primary key, \n" +
                        "book varchar (200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    private void createWithdrawTable() {
        String TABLE_NAME = "WITHDRAWAL";
        try{
            stmt = conn.createStatement();
            DatabaseMetaData dmn = conn.getMetaData();
            ResultSet tables = dmn.getTables(null, null, TABLE_NAME, null);
            if (tables.next()){
                System.out.println("Table " + TABLE_NAME + " already exists.");
            }
            else{
                String statement = "CREATE TABLE " + TABLE_NAME +"(" +
                        "name varchar (200) primary key, \n" +
                        "book varchar (200))";
                System.out.println(statement);
                stmt.execute(statement);
            }
        }
        catch (SQLException e){
            System.out.println("aaaaa");
            System.out.println(e.getMessage() + "setting up database");
        }
    }

    public boolean execAction(String qu){
        try{
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getLocalizedMessage(), "Error Occurred", JOptionPane.ERROR_MESSAGE);
            System.out.println("exception at execQuery" + e.getLocalizedMessage());
            return false;
        }
    }

    public ResultSet execQuery(String query){
        ResultSet resultSet;
        try {
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(query);
        }
        catch(SQLException e){
            System.out.println("Exception at Execute query");
            return null;
        }
        return resultSet;
    }
}
