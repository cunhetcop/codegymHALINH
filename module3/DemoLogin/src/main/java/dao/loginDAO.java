package dao;

import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class loginDAO {
    public static Account login(String username, String password) {
        try {
            String sql = "select * from account where username=? and password=?";
            Connection connection = ConnectMySQL.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);


            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if (resultSet.next()) {
                int id = resultSet.getInt("id"); //tên trong ngoặc là tên giống hệt trong mySQL
                String username1 = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                String address = resultSet.getString("address");
                Date birthday = resultSet.getDate("date");
                int id_role = resultSet.getInt("id_role");
                account = new Account(id,username1,password1,address,birthday,id_role);
            }
            return account;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
