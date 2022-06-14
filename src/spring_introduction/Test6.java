package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        //создание контейнера
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Config1.class");


    }
}
