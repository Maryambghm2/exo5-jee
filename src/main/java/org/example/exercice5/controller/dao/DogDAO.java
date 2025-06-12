package org.example.exercice5.controller.dao;


import org.example.exercice5.model.Dog;
import org.example.exercice5.util.HibernateSession;
import org.hibernate.query.Query;

import java.util.List;

public class DogDAO extends BaseDAO<Dog> {

    public DogDAO() {
        super(HibernateSession.getSessionFactory(), Dog.class);
    }


    @Override
    public List<Dog> getAll() {
        try {
            session = sessionFactory.openSession();
            return session.createQuery("SELECT d FROM Dog d", Dog.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Dog getById(int id) {
        try {
            session = sessionFactory.openSession();
            Query<Dog> query = session.createQuery("SELECT d FROM Dog d WHERE d.id=:id", Dog.class);
            query.setParameter("id", id);
            return query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

//
//    public static void main(String[] args) {
//        DogDAO dogDAO = new DogDAO();
//
//        Dog dog = Dog.builder().name("Ted").breed("Malinois").dateBirth(LocalDate.now()).build();
//
//        dogDAO.save(dog);
//    }


}
