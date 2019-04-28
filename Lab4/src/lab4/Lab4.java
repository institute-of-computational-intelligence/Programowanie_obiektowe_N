package lab4;

import java.util.List;

public class Lab4 {

    public static void main(String[] args) {
        String connectionString = "jdbc:oracle:thin:STUDENT_IISI_3/kik_iisi_student_04_2019@oracle4.icis.pcz.pl:1521:oracle4";
        IProductRepository productRepository = new ProductRepository(connectionString);
        List<Product> allProducts = productRepository.Get();
//        for (Product product : allProducts) {
//            System.out.println(product);
//        }
//        System.out.println("===========================");
//        Product newProduct = new Product("MONITOR", "HYAMA", 2999.99f);
//        productRepository.Add(newProduct);
//        System.out.println("Product created: " + newProduct);
//        System.out.println("===========================");
//        Product p1 = productRepository.Get(3);
//        System.out.println();
//        System.out.println(p1);
//        p1.setPrice(21500);
//        productRepository.Update(p1, 2);
//        System.out.println("Product updated: " + p1);
//        productRepository.Delete(2);
//        System.out.println("Product deleted");
    }
}
