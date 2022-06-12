package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        //внедрение бина с назначенным id
        //Cat cat = context.getBean("catBean", Cat.class);

        //внедрение бина вс дефолтным id
       // Cat cat = context.getBean("cat", Cat.class);

       // cat.say();

        Person person = (Person) context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.printf("Surname %s, age %d", person.getSurname(), person.getAge());
        context.close();
    }
}
