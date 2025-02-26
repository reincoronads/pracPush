package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnector {
    
    public Connection connect;
    
    public dbConnector(){
    try {
        // Ensure the URL, username, and password are correct
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb", "root", "");
        System.out.println("Connected to the database.");
    } catch (SQLException ex) {
        System.out.println("Failed to connect to the database:");
        ex.printStackTrace();
    }
}
    
    // Function to retrieve data
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }
    
    // Getter for the connection object
    public Connection getConnection() {
        return connect;
    }
    
    //Function to save data
    public int insertData(String sql){
        int result;
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully!");
            pst.close();
            result =1;
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
            result =0;
        }
        return result;
    }
}