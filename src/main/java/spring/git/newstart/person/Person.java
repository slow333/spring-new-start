package spring.git.newstart.person;

import java.time.LocalDate;

public class Person {
    private String name;
    private String email;
    private LocalDate birthDay;
    private int age;

    public Person(String name, String email, LocalDate birthDay, int age) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.age = age;
    }

    public Person() { }

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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
