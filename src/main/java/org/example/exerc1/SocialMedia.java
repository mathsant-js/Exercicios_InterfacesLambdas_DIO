package org.example.exerc1;

public class SocialMedia implements Message {

    @Override
    public void sendMessage(String message) {
        System.out.println("Social Media: " + message);
    }
}
