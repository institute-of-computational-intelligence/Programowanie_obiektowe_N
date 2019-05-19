package javalab4;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private String connectionString;

    public ProductRepository(String connectionString) {
        this.connectionString = connectionString;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException a){
            System.err.println("Error. " + a.getMessage());
        }
    }

    @Override
    public List<Product> Get() {
        Connection conn;
        Statement stmt;
        Product product;
        List<Product> productList = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM PRODUKTY";
            ResultSet rs = stmt.executeQuery(sql);
            while( rs.next() ){
                product = new Product();
                product.setId( rs.getInt("id") );
                product.setType( rs.getString("type") );
                product.setName( rs.getString("name") );
                product.setPrice( rs.getFloat("price") );
                productList.add(product);
            }

          rs.close();
          stmt.close();
          conn.close();   
        } catch (SQLException a) {
          System.err.println("Error in ProductRepository.Get " + a.getMessage() );
        }
        
        return productList;
    }

    @Override
    public Product Get(int id) {
        Connection conn;
        Statement stmt;
        Product product = new Product();
        
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM PRODUKTY WHERE id="+id;
            ResultSet rs = stmt.executeQuery(sql);
            while( rs.next() ){
                product.setId( rs.getInt("id") );
                product.setType( rs.getString("type") );
                product.setName( rs.getString("name") );
                product.setPrice( rs.getFloat("price") );
            }

          rs.close();
          stmt.close();
          conn.close();   
        } catch (SQLException a) {
          System.err.println("Error in ProductRepository.Get: " + a.getMessage() );
        }
        
        return product;
    }

    @Override
    public void Add(Product product) {
        Connection conn;
        Statement stmt;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "INSERT INTO PRODUKTY (type, name, price) VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, product.getType());
            ps.setString(2, product.getName());
            ps.setFloat(3, product.getPrice());
            ResultSet rs = ps.executeQuery();

            rs.close();
            stmt.close();
            conn.close();   
        } catch (SQLException a) {
            System.err.println("Error in ProductRepository.Add: " + a.getMessage() );
        }
    }

    @Override
    public void Update(Product product, int productid) {
        Connection conn;
        Statement stmt;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "UPDATE PRODUKTY SET name = ?, type = ?, price = ? WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getType());
            ps.setFloat(3, product.getPrice());
            ps.setInt(4, productid);
            ResultSet rs = ps.executeQuery();

            rs.close();
            stmt.close();
            conn.close();   
        } catch (SQLException a) {
            System.err.println("Error in ProductRepository.Update: " + a.getMessage() );
        }
    }

    @Override
    public void Delete(int id) {
        Connection conn;
        Statement stmt;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "DELETE FROM PRODUKTY WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            rs.close();
            stmt.close();
            conn.close();   
        } catch (SQLException a) {
            System.err.println("Error in ProductRepository.Delete: " + a.getMessage() );
        }
    }
    
}
