package app.model;

import app.config.EmailSenderCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(value = EmailSenderCondition.class)
public class EmailSender implements Sender {

    public void sendMessage(String message, String target) {
        System.out.println("Email: " + message + " to: " + target);
    }
}
