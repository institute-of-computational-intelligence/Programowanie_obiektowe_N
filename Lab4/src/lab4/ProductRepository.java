package lab4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductRepository implements IProductRepository {

    private String connectionString;
    Connection connection;

    public ProductRepository(String connectionString) {
        this.connectionString = connectionString;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {
            System.out.println("There is no oracle JDBC Driver");
        }

        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }

        if (connection != null) {
            System.out.println("Success! Connected to database.");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

    @Override
    public List<Product> Get() {
        List<Product> products = new ArrayList<>();
        try {
            // String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
            String sql = "SELECT * FROM PRODUKTY";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs != null) {
                if (!rs.isBeforeFirst() ) {    
                    System.out.println("No data");
                } 
                while (rs.next()) {
                    Product product = new Product();
                    product.setId(rs.getInt(1));
                    product.setType(rs.getString(2));
                    product.setName(rs.getString(3));
                    product.setPrice(rs.getFloat(4));
                    products.add(product);
                    System.out.println(product);
                }
            } else {
                System.out.println("Nothing to do here.");
            }
        } catch (SQLException ex) {
            System.err.println("Exception: " + ex);
        }
        return products;
    }

    @Override
    public Product Get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Product product, int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
