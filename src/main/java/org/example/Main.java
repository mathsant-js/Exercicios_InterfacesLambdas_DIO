package org.example;

import org.example.exerc1.*;

import java.util.List;

public class Main {
    static void main() {
        // Exercise 1
        String message = "Feliz Aniversário!";

        List<Message> messageList = List.of(
                new SMS(),
                new Email(),
                new SocialMedia(),
                new WhatsApp()
        );

        messageList.forEach(m -> m.sendMessage(message));
    }
}
