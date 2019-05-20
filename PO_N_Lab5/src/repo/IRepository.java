/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.List;

/**
 *
 * @author Rafal
 */
public interface IRepository<T> {
    List<T> Get();
    T Get(int id);
    T AddOrUpdate(T entity);
    void Delete(T entity);    
}
