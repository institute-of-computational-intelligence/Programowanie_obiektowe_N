package laboratorium_4;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;


public class Laboratorium_4 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        

        String connectionString = "jdbc:oracle:thin:STUDENT_IISI_5/kik_iisi_student_04_2019@oracle4.icis.pcz.pl:1521:oracle4";
        IProductRepository productRepository = new ProductRepository(connectionString);
        List<Product> allProducts = productRepository.Get();
        
        for (Product product : allProducts) {
            System.out.println(product);
        }
        System.out.println("===========================");
        /*
        Product newProduct = new Product("MONITOR", "HYAMA", 2999.99f);
        productRepository.Add(newProduct);
        System.out.println("Product created: " + newProduct);
        System.out.println("===========================");
        Product p1 = productRepository.Get(3);
        System.out.println();
        System.out.println(p1);
        p1.setPrice(21500);
        productRepository.Update(p1, 2);
        System.out.println("Product updated: " + p1);
        productRepository.Delete(2);
        System.out.println("Product deleted");*/
    }

}
