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
public interface IProductRepository {
    List<Product> Get();
    Product Get(int id);
    void Add(Product product);
    void Update(Product product, int productId);
    void Delete(int id);
}
