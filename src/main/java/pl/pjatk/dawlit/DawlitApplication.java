package pl.pjatk.dawlit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(CustomConfig.class)
//@ImportResource("bea.xml")

public class DawlitApplication {

	public static void main(String[] args) {

		SpringApplication.run(DawlitApplication.class, args);
	}

}
