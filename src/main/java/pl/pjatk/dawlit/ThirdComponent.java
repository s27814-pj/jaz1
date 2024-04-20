package pl.pjatk.dawlit;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {

    public ThirdComponent(ApplicationContext applicationContext){
        FirstComponent ofFirst = applicationContext.getBean("firstComponent", FirstComponent.class);
        SecondComponent ofSecond = applicationContext.getBean("secondComponent", SecondComponent.class);
        //ofSecond.printHello();
        //ofFirst.printHello();
        applicationContext.getBean("firstComponent", FirstComponent.class).printHello();
        applicationContext.getBean("secondComponent", SecondComponent.class).printHello();

        //applicationContext = new ClassPathXmlApplicationContext("bea.xml");
    }
}
