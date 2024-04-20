package pl.pjatk.dawlit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
@ConfigurationProperties(prefix = "custom")

public class CustomConfig {
    private String loginUrl;
    private Credientals credientals;

    public Credientals getCredientals() {

        return credientals;
    }

    public void setCredientals(Credientals credientals) {
        this.credientals = credientals;
    }

    private String credentialsUser;
    private String password;

    public CustomConfig(){
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public String getCredentialsUser() {
        return credentialsUser;
    }

    public String getPassword() {
        return password;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setCredentialsUser(String credentialsUser) {
        this.credentialsUser = credentialsUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
