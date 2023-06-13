package spring.git.newstart.person;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {


    public List<Person> findAllPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add( new Person("kim", "s1@g.com", LocalDate.of(1967, 1, 14), 56));
        personList.add( new Person("kirm", "s2@g.com", LocalDate.of(1968, 1, 14), 56));
        personList.add( new Person("kimh", "s3@g.com", LocalDate.of(1969, 1, 14), 56));

        return personList;
    }

    public Person findByEmail(String email) {
        return findAllPersons().stream().filter(p -> email.equals(p.getEmail())).findFirst().orElseThrow(null);
    }

    public Person update(Person person) {
        Person newPerson = findByEmail(person.getEmail());
        newPerson.setAge(person.getAge());
        newPerson.setEmail(person.getEmail());
        newPerson.setBirthDay(person.getBirthDay());
        newPerson.setName(person.getName());
        return newPerson;
    }

    public void delete(Person person) {
        List<Person> personList = findAllPersons();
        Person newPerson = findByEmail(person.getEmail());
        personList.remove(newPerson);
    }
}
