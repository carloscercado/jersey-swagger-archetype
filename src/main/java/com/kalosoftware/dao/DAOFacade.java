package com.kalosoftware.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public abstract class DAOFacade<T> {

    public void create(T obj) {
       
    }

    public void delete(T obj) {
        
    }

    public void update(T obj) {
      
    }

    public List<T> read() {
        return null;
    }

    public T getById(final Long id) {
        return null;
    }

    private Class getParameterizedClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
