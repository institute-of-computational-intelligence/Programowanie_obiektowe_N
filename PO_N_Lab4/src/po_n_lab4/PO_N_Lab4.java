/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab4;

import java.util.List;

/**
 *
 * @author Notebook
 */
public class PO_N_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String connectionString = "jdbc:oracle:thin:login/password@host:port:sid";
        IProductRepository productRepository = new ProductRepository(connectionString);
        List<Product> allProducts = productRepository.Get();
        for (Product product : allProducts) {
            System.out.println(product);
        }
        System.out.println("===========================");
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
        System.out.println("Product deleted");
    }

}
