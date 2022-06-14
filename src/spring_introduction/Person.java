package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
//@Component
public class Person {

    //@Value("Halitov")//установление зачения поля
    //@Value("${person.surname}")//установление зачения поля из файла myApp.properties
    private String surname;

    //@Value("51")//установление зачения поля
    //@Value("${person.age}") //установление зачения поля из файла myApp.properties
    private int age;

    public String getSurname() {
        System.out.println("Getter Surname");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Setter Surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Getter Age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Age");
        this.age = age;
    }
   // @Autowired
   // @Qualifier("catBean")
    private Pet pet;

   // @Autowired
    public void setPet(Pet pet) {
        System.out.println("Setter Pet: add pet.");
        this.pet = pet;
    }
    //public Person() { System.out.println("Object Person id created"); }
/*
   // @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
        System.out.println("Object Person with parameter id created");
    }*/
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Object Person with parameter id created");
    }

    public void callYourPet() {
        System.out.println("Зов питомца");
        pet.say();
    }
}