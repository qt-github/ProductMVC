package repositories;

import java.util.List;

public interface CrudRepository<T, ID> {

    T create(T entity);

    T update(T entity, ID id);

    T delete(T entity, ID id);

    T findByID(T entity, ID id);

    List<T> findAll();
}
