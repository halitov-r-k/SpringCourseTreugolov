package spring_introduction;

public class Person {
    private String surname;
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

    private Pet pet;

    public void setPet(Pet pet) {
        System.out.println("Setter Pet: add pet.");
        this.pet = pet;
    }
    public Person() { System.out.println("Object Person id created"); }
   // public Person(Pet pet) { this.pet = pet; System.out.println("Object Person with parameter id created");}

    public void callYourPet() {
        System.out.println("Зов питомца");
        pet.say();
    }
}
