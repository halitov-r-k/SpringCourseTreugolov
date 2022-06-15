package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        //создание контейнера
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Config1.class);
        //создание бина из класса
        Person person = context.getBean("personBean", Person.class);
        //person.callYourPet();
        System.out.printf("Фамилия: %s, возраст: %d. \n", person.getSurname(), person.getAge());

    /*   Pet cat1 = context.getBean("catBean", Pet.class);
       Pet cat2 = context.getBean("catBean", Pet.class);
       cat1.say();*/


        context.close();



    }
}
