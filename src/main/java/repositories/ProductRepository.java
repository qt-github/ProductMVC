package repositories;

import entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;


public class ProductRepository implements CrudRepository<Product,Long> {
    private EntityManager entityManager;

    public ProductRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public ProductRepository() {

    }

    @Override
    public Product create(Product entity) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(entity);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return null;
        }
        return entity;
    }

    @Override
    public Product update(Product entity, Long aLong) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(entity);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return null;
        }

        return entity;
    }

    @Override
    public Product delete(Product entity, Long aLong) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Object oj =findByID(entity, aLong);
            entityManager.remove(aLong);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return null;
        }
        return entity;
    }

    @Override
    public Product findByID(Product entity, Long aLong) {
        return (Product) entityManager.find(entity.getClass(), aLong);
    }

    @Override
    public List<Product> findAll() {
        return entityManager.createQuery("select p from Product p",Product.class).getResultList();
    }
}
