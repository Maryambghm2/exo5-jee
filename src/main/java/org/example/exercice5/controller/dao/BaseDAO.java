package org.example.exercice5.controller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class BaseDAO<T> {
    protected SessionFactory sessionFactory;
    protected Class<T> type;
    protected Session session;

    public BaseDAO(SessionFactory sessionFactory, Class<T> type) {
        this.sessionFactory = sessionFactory;
        this.type = type;
    }

    public T save(T element) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(element);
            session.getTransaction().commit();
            return element;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    public T getById(int id) {
        try {
            session = sessionFactory.openSession();
            return session.get(type, id);
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }


    public abstract List<T> getAll();


}
