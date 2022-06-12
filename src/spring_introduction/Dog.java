package spring_introduction;

import org.springframework.stereotype.Component;

@Component
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

    public void init() { System.out.println("Class Dog Init method."); }
    public void destroy() { System.out.println("Class Dog Destroy method."); }
}

