package oauth2authorizationserver.oauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories
@EnableWebSecurity
public class Oauth2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2DemoApplication.class, args);
    }

}
