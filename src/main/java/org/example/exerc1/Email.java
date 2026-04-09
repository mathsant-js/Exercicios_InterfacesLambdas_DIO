package org.example.exerc1;

public record Email() implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
