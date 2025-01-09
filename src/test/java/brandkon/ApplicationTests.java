package brandkon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootTest
class ApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
