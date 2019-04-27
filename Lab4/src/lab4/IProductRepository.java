package lab4;

import java.util.List;

public interface IProductRepository {
    List<Product> Get();
    Product Get(int id);
    void Add(Product product);
    void Update(Product product, int productId);
    void Delete(int id);
}
