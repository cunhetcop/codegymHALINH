package dao;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Product {
    static Connection connection = Connect_Mysql.getConnect();

    public static List<Product> getAll() {
        String sql = "Select * from sanphamdemo"; //table trong mySQL
        List<Product> products = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String img = resultSet.getString("img");
                Double price = resultSet.getDouble("price");
                products.add(new Product(id,name,img,price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void save (Product product){
        String sql = "insert into sanphamdemo value (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,product.getId());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setString(3,product.getImg());
            preparedStatement.setDouble(4,product.getPrice());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletefromSQL(int id){
        String sql = "DELETE FROM sanphamdemo WHERE ID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
