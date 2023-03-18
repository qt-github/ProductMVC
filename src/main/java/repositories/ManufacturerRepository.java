package repositories;

import entities.Manufacturer;
import entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class ManufacturerRepository implements CrudRepository<Manufacturer,Long>{
    private EntityManager entityManager;
    @Override
    public Manufacturer create(Manufacturer entity) {
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
    public Manufacturer update(Manufacturer entity, Long aLong) {
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
    public Manufacturer delete(Manufacturer entity, Long aLong) {
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
    public Manufacturer findByID(Manufacturer entity, Long aLong) {
        return (Manufacturer) entityManager.find(entity.getClass(), aLong);
    }

    @Override
    public List<Manufacturer> findAll() {
        return entityManager.createQuery("select m from Manufacturer m ", Manufacturer.class).getResultList();
    }
}
