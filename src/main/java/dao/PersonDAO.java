package dao;

import entity.Person;

import java.util.List;

public interface PersonDAO {
    public Person findPersonById(int id);

    public void save(Person person);

    public void update(Person person);

    public void delete(int id);

    public List<Person> findAll();
}

