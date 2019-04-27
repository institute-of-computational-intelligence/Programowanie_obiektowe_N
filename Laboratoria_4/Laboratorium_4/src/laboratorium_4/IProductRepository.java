
package laboratorium_4;

import java.util.List;


public interface IProductRepository {
    public List<Product> Get();
    public Product Get(int id);
    public void Add(Product product);
    public void Update(Product product,int productId);
    public void Delete(int id);
    
}
