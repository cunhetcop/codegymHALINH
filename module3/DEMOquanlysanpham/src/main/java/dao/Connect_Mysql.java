package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_Mysql {
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demo";
            String username = "rootc0722g1";
            String pass = "c0722g1";
            return DriverManager.getConnection(url,username,pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
