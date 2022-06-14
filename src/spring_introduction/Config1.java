//конфигурация проекта Java-code
package spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring_introduction") //указание пакета в котором сканировать компоненты
public class Config1 {}