package pl.pjatk.dawlit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public NewClass newClass(CustomConfig customConfig){
        System.out.println(customConfig.getLoginUrl());
        System.out.println(customConfig.getCredientals().getUser());
        System.out.println(customConfig.getCredientals().getPassword());
        return new NewClass();
    }

    @Bean
    public List<String> defaultData(){
        return List.of("av", "tet", "teraz", "inne", "piate");
    }
}
