package pl.pjatk.dawlit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirstComponent {
    public FirstComponent(@Value("${my.custom.property:#{null}}") String property, SecondComponent secondComponent, List<String> list){
        //System.out.println("FirstComponent");
        //System.out.println(list);
        //System.out.println(property);
    }
    public void printHello(){

        //System.out.println("printHello() FirstComponent");
    }

}
