package spring.git.newstart.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("inMem")
public class InMemPersonService implements PersonService{

    private final PersonRepoInMem repository;

    public InMemPersonService(PersonRepoInMem repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getAllPersons() {
        return repository.findAllPersons();
    }

    @Override
    public Person findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Person update(Person person) {
        return repository.update(person);
    }

    @Override
    public Person addPerson(Person person) {
        return repository.save(person);
    }

    @Override
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }
}
