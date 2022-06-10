package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //создание контейнера
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //получение объекта из контейнера
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
