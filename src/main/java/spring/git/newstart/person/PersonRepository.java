package spring.git.newstart.person;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class PersonRepository {

    private final List<Person> personList = new ArrayList<>();

    public List<Person> findAllPersons(){
        return personList;
    }

    public Person findByEmail(String email) {
        return findAllPersons().stream().filter(p ->
                email.equals(p.getEmail())).findFirst().orElseThrow(null);
    }

    public Person update(Person person) {
        var personIndex = IntStream.range(0, personList.size())
                .filter(index -> personList.get(index).getEmail().equals(person.getEmail()))
                .findFirst().orElse(-1);
        if (personIndex > -1) {
            personList.set(personIndex, person);
            return person;
        }
        return null;
    }

    public void deleteByEmail(String email) {
        var newPerson = findByEmail(email);
        if(!newPerson.toString().isEmpty()){
            personList.remove(newPerson);
        }
    }

    public Person save(Person person) {
        personList.add(person);
        return person;
    }
}