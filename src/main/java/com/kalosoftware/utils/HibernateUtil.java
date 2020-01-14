package com.kalosoftware.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 *
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            final StandardServiceRegistry standardRegistry
                    = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            final Metadata metaData
                    = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            sessionFactory = metaData.getSessionFactoryBuilder().build();
        } catch (Throwable th) {
            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
