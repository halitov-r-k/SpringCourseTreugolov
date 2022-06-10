package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean") //аннотация определяет клас как компонент
@Component //аннотация без назначенного id
public class Cat implements Pet {
    public Cat() { System.out.println("Class Cat is created."); }

    @Override
    public void say() { System.out.println("Мяу"); }
}
