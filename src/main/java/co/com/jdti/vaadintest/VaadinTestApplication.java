package co.com.jdti.vaadintest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaadinTestApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(VaadinTestApplication.class, args);
    }
}
