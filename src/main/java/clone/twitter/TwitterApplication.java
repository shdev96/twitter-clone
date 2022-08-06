package clone.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class TwitterApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(TwitterApplication.class, args);
        DispatcherServlet dispatcherServlet = (DispatcherServlet)applicationContext.getBean("dispatcherServlet");
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }
}
