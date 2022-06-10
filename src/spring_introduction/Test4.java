package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog1 = context.getBean("myPet", Dog.class);
       // myDog1.setName("Belka");
        Dog myDog2 = context.getBean("myPet", Dog.class);
       // myDog2.setName("Strelka");
       // System.out.println(myDog1.getName() + " " + myDog2.getName());

        context.close();
    }
}
