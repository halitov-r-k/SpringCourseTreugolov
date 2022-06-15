//конфигурация проекта Java-code
package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")//указание файла со свойствами
//@ComponentScan("spring_introduction") //указание пакета в котором сканировать компоненты
public class Config1 {
    //создание бина cat
    @Bean
    @Scope("singleton")
    public Pet catBean() { return new Cat(); }

    //создание Бина person с внедрением зависимости cat
    @Bean
    public Person personBean() {return  new Person(catBean()); }


}