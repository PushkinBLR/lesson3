package dao;

import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HiberSession;

import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public Person findPersonById(int id) {
        return HiberSession.getSessionFactory().openSession().get(Person.class, id);
    }

    @Override
    public void save(Person person) {
        Session session = HiberSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(person);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Person person) {
        Session session = HiberSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.update(person);
        transaction.commit();
        session.close();

    }

    @Override
    public void delete(int id) {
        Session session = HiberSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Person dPerson = findPersonById(id);
        session.delete(dPerson);
        transaction.commit();
        session.close();
    }


    @Override
    public List<Person> findAll() {
        List<Person> persons =
                HiberSession.getSessionFactory().openSession().createQuery("From Person").list();
        System.out.print(persons);
        return persons;
    }

}