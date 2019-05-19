package javalab4;

public class Application {
    private IProductRepository productRepository;

    public Application(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public void DisplayAllProducts(){
        var foo = productRepository.Get();
        for (var product : foo) {
             System.out.println(product);
        }
    }
}
