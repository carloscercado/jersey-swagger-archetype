package com.kalosoftware.dao;

import com.kalosoftware.models.Example;
import com.kalosoftware.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class ExampleDAO extends DAOFacade<Example> {
    
    /*
    * A unique operation
    */
    public void otherOperation(Example obj) {
        Session session = null;
        Session sesion = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            // operations examples start
            sesion.save(obj);
            // operations examples end
            sesion.getTransaction().commit();
        } catch (Exception ex) {
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }

}
