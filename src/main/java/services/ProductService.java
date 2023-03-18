package services;

import entities.Product;
import repositories.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Product create (Product entity){
        return repo.create(entity);
    }

    public Product update (Product entity, Long aLong){
        return repo.update(entity,aLong);
    }

    public Product delete(Product entity, Long aLong){
        return repo.delete(entity, aLong);
    }

    public Product findByID(Product entity, Long aLong){
        return repo.findByID(entity, aLong);
    }

    public List<Product> findAll(){
        return repo.findAll();
    }
}
