package org.example.exerc1;

public record SMS() implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
