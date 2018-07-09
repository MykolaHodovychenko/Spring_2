package app;

import app.config.AppConfiguration;
import app.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Main {

    public static final Properties config = new Properties();

    static {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try (InputStream resourceStream = loader.getResourceAsStream("app.properties")) {
            config.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfiguration.class);

        User user = context.getBean(User.class);
        user.send("Hello!","Vasia");

    }
}
