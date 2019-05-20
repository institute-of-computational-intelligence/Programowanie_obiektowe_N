package po_n_lab5;

import entities.Orders;
import entities.Products;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repo.IRepository;
import repo.NewHibernateUtil;
import repo.Repository;

/**
 *
 * @author Rafal
 */
public class PO_N_Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        System.out.println("============CREATE CLASSES FROM TABLES==========");
        IRepository<Orders> orderRepo = new Repository<>(Orders.class);
        Orders order = orderRepo.Get(1);
        System.out.println(order);
        List<Orders> orders = orderRepo.Get();
        orders.forEach((ord) -> { // for equivalent in lambda
            System.out.println(ord);
        });

        Orders newOrder = orderRepo.AddOrUpdate(new Orders(3, new Date(2019, 1, 1), "Jan", "Kowalski", new Date(2019, 1, 2), "Odbiór własny", "Częstochowa ALEJA NMP 30/22"));
        System.out.println(orderRepo.Get(3));
        newOrder.setClientlastname("Bednarski");
        newOrder.setClientfirstname("Marek");
        orderRepo.AddOrUpdate(newOrder);
        System.out.println(orderRepo.Get(3));
        orderRepo.Delete(newOrder);

        System.out.println("====================================");
        orders.forEach((ord) -> { // for equivalent in lambda
            System.out.println(ord);
        });

        System.out.println("=============PRODUCTS=======================");
        IRepository<Products> productsRepo = new Repository<>(entities.Products.class);
        Products product = productsRepo.Get(1);
        System.out.println(product);
        List<Products> products = productsRepo.Get();
        products.forEach(prod -> {
            System.out.println(prod);
        });
        Products newProduct = productsRepo.AddOrUpdate(new Products(20, order, "Keyboard", "Logitech", new BigDecimal(30.5f)));
        System.out.println(productsRepo.Get(20));
        newProduct.setName("TPLink");
        newProduct.setType("Router");
        productsRepo.AddOrUpdate(newProduct);
        System.out.println(productsRepo.Get(20));
        productsRepo.Delete(newProduct);
        System.out.println("====================================");
        products.forEach(prod -> {
            System.out.println(prod);
        });
        NewHibernateUtil.shutdown();
    }
}
