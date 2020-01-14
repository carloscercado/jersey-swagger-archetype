package com.kalosoftware.dao;

import com.kalosoftware.utils.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public abstract class DAOFacade<T> {

    public void create(T obj) {
        Session session = null;
        Session sesion = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(obj);
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void delete(T obj) {
        Session session = null;
        Session sesion = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(obj);
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public void update(T obj) {
        Session session = null;
        Session sesion = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(obj);
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

    public List<T> read() {
        Session sesion = null;
        final List<T> lista = new ArrayList();
        try {
            final String hql = String.format("from %s", this.getParameterizedClass());
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            lista.addAll(sesion.createQuery(hql).list());
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
            return lista;
        }
    }

    public T getById(final Long id) {
        Session sesion = null;//
        T obj = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            obj = (T) sesion.find(this.getParameterizedClass(), id);
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
            return obj;
        }
    }

    private Class getParameterizedClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
