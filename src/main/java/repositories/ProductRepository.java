package repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductRepository implements CrudRepository {

    private EntityManager entityManager;

    private String entityName;

    public ProductRepository(String entityName) {
        this.entityName = entityName;
        entityManager = Persistence.createEntityManagerFactory("toan").createEntityManager();
    }

    @Override
    public Object create(Object entity) {
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
    public Object update(Object entity, Object o) {
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
    public Object delete(Object entity, Object o) {
        return null;
    }

    @Override
    public Object findByID(Object entity, Object o) {
        return null;
    }

    @Override
    public Object findAll(Object entity) {
        return null;
    }
}
