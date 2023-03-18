import entities.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repositories.CrudRepository;
import repositories.ProductRepository;

public class ProductTest {
    CrudRepository<Product, Long> repo;
//    ProductTest(){
//        repo = new ProductRepository();
//    }
    @Test
    void insertProductc(Product product){
        Product p = repo.create(product);



    }
}
