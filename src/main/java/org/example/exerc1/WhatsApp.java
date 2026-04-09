package org.example.exerc1;

public record WhatsApp() implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("WhatsApp: " + message);
    }
}
