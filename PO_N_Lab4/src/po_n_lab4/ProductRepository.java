package po_n_lab4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private String connectionString;


    public ProductRepository(String connectionString) {
        this.connectionString = connectionString;
    }

    public List<Product> Get() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Product> products = new ArrayList<Product>();

        try {
            con = DriverManager.getConnection(this.connectionString);

            ps = con.prepareStatement("select ID, TYPE, NAME, PRICE from PRODUCTS");

            rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product(
                    rs.getInt("ID"),
                    rs.getString("TYPE"),
                    rs.getString("NAME"),
                    rs.getFloat("PRICE")
                );
                products.add(product);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }

        return new ArrayList<Product>();
    }

    public Product Get(int id) {
        return new Product();
    }

    public void Add(Product product) {
        Connection con = null;

        try {
            con = DriverManager.getConnection(this.connectionString);
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {

        }
    }

    public void Update(Product product, int productId) {

    }

    public void Delete(int id) {

    }
}