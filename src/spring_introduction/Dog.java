package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component //аннотация для определения класса в контейнер
//@Scope("singleton") //аннотация определяет дефолтный тип т.е создает объект при чтении контейнером
//@Scope("prototype") //аннотация при которой создаются объекты при получении их из context
public class Dog  implements Pet {
    public Dog() { System.out.println("Class Dog is created."); }
   /* private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    @Override
    public void say() { System.out.println("гав"); }

    @PostConstruct
    public void init() { System.out.println("Class Dog Init method."); }

    @PreDestroy
    public void destroy() { System.out.println("Class Dog Destroy method."); }
}

