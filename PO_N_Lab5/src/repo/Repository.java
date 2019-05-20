/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rafal
 */
public class Repository<T> implements IRepository<T> {

    private Session session = null;
    private final Class<T> entityType;

    public Repository(Class<T> entityType) {
        this.entityType = entityType;
    }

    @Override
    public List<T> Get() {
        session = NewHibernateUtil.getSessionFactory().openSession();
        String queryStr = String.format("from %s", entityType.getName());
        List<T> list = session.createQuery(queryStr).list();
        if (session.isOpen()) {
            session.close();
        }
        return list;
    }

    @Override
    public T Get(int id) {
        session = NewHibernateUtil.getSessionFactory().openSession();
        T entity = (T) session.get(this.entityType, id);
        if (session.isOpen()) {
            session.close();
        }
        return entity;
    }

    @Override
    public T AddOrUpdate(T entity) {
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        if (session.isOpen()) {
            session.close();
        }
        return entity;
    }   

    @Override
    public void Delete(T entity) {
      session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        if (session.isOpen()) {
            session.close();
        }
    }    
}
