package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //создание контейнера
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //получение объекта из контейнера
        Person person = context.getBean("myPerson", Person.class);
        //вызов метода из объекта
        person.callYourPet();
        System.out.printf("Фамилия: %s, Возраст: %d. ", person.getSurname(), person.getAge());
        //закрытие контейнера
        context.close();
    }
}
