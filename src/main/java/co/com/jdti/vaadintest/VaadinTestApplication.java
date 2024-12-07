package co.com.jdti.vaadintest;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Theme(value = "my-app")
@SpringBootApplication
public class VaadinTestApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(VaadinTestApplication.class, args);
    }
}
