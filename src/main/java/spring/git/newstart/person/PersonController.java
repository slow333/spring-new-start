package spring.git.newstart.person;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping
    public List<Person> findAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/{email}")
    public Person findByEmail(@PathVariable String email) {
        return personService.findByEmail(email);
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person){
        List<Person> personList = personService.getAllPersons();
        personList.add(person);
        return person;
    }

    @DeleteMapping("/{email}")
    private void deletePerson(@PathVariable String email) {
        personService.deleteByEmail(email);
    }
}
