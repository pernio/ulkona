package app.netlify.jinzo.ulkona;

import org.springframework.boot.SpringApplication;

public class TestUlkonaApplication {

    public static void main(String[] args) {
        SpringApplication.from(UlkonaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
