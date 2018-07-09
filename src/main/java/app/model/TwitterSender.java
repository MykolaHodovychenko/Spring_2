package app.model;

import app.config.TwitterSenderCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(value = TwitterSenderCondition.class)
public class TwitterSender implements Sender {

    public void sendMessage(String message, String target) {
        System.out.println("Tweet: " + message + " is sending to " + target);
    }
}
