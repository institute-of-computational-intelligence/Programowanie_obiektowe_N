package laboratorium_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductRepository implements IProductRepository {

    private String connectionString;

    public ProductRepository(String connectionString) throws SQLException, ClassNotFoundException {

        this.connectionString = connectionString;
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    @Override
    public List<Product> Get() {
        try {
            Connection connection = DriverManager.getConnection(connectionString);
            Statement s = connection.createStatement();
            String query = "SELECT * FROM PRODUCTS";
            ResultSet rs = s.executeQuery(query);
            List<Product> lista = new ArrayList<>();
            if (rs != null) {
                while (rs.next()) {
                    Product p = new Product();
                    p.setType(rs.getString("Type"));
                    p.setName(rs.getString("Name"));
                    p.setPrice(rs.getFloat("price"));
                    p.setId(rs.getInt("id"));
                    lista.add(p);
                    
                }
            }

            s.close();
            return lista;
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        return null;

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
