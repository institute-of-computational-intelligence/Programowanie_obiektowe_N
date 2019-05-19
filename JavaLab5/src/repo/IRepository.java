package repo;

import java.util.List;

public interface IRepository<T> {
    List<T> Get();
    T Get(int id);
    T AddOrUpdate(T entity);
    void Delete(int id);
}
