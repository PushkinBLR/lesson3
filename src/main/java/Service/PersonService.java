package Service;

import dao.PersonDAOImpl;
import entity.Person;

import java.util.List;

public class PersonService {
    private PersonDAOImpl persondaoimpl = new PersonDAOImpl() {
    };

    public PersonService() {
    }

    public Person findPerson(int id) {
        return persondaoimpl.findPersonById(id);
    }

    public void savePerson(Person person) {
        persondaoimpl.save(person);
    }

    public void updatePerson(Person person) {
        persondaoimpl.update(person);
    }
    public void deletePerson(int id) {
        persondaoimpl.delete(id);
    }

    public List<Person> findAllPerson() {
        persondaoimpl.findAll();
        return null;
    }

}
