package spring.git.newstart.person;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "person_db")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    @Column(unique = true)
    private String email;
    private LocalDate birthDay;
    @Transient
    private int age;

    public Person(String name, String email, LocalDate birthDay, int age) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.age = age;
    }

    public Person() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return Period.between(birthDay, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
