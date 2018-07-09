package app.config;

import app.model.EmailSender;
import app.model.TwitterSender;
import app.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"app"})
public class AppConfiguration {

//    @Bean
//    public User user() {
//        return new User();
//    }

//    @Bean
//    @Conditional(TwitterSenderCondition.class)
//    public TwitterSender twitterSender() {
//        return new TwitterSender();
//    }
//
//    @Bean
//    @Conditional(EmailSenderCondition.class)
//    public EmailSender emailSender() {
//        return new EmailSender();
//    }
}
