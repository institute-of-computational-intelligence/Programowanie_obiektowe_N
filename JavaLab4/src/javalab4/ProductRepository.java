package javalab4;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        Product product = new Product();
        List<Product> productList = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(connectionString);
            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM PRODUKTY";
            ResultSet rs = stmt.executeQuery(sql);
            while( rs.next() ){
                product.setId( rs.getInt("id") );
                product.setType( rs.getString("type") );
                product.setName( rs.getString("name") );
                product.setPrice( rs.getFloat("price") );
                productList.add(product);
                System.out.println(product);
            }

          rs.close();
          stmt.close();
          conn.close();   
        } catch (SQLException a) {
          System.err.println("Error in ProductRepository. " + a.getMessage() );
        }
        
        return productList;
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
    public void Update(Product product, int productid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
