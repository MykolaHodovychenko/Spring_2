package app.model;

import org.springframework.stereotype.Component;

@Component
public interface Sender {
    void sendMessage(String message, String target);
}
