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
public class Application {

    private final IProductRepository productRepository;

    public Application(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void DisplayAllProducts() {
        List<Product> products = productRepository.Get();
        for (Product product : products) {
                System.out.println(product);
        }
    }

}
