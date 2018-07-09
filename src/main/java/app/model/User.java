package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Sender sender;

    public User() {}

    public void send(String message, String target) {
        if (sender != null) {
            sender.sendMessage(message, target);
        } else {
            throw new IllegalStateException("нет сендера");
        }
    }

}
