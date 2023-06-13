package spring.git.newstart.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
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
<<<<<<< HEAD
    public void delete(String email) {
        repository.delete(email);
    }

    @Override
    public Person addPerson(Person person) {
        return repository.save(person);
=======
    public void delete(Person person) {
        repository.delete(person);
>>>>>>> origin/main
    }
}
