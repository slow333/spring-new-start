package spring.git.newstart.person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person findByEmail(String email);

    Person update(Person person);
    void delete(Person person);

}
