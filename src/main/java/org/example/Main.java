package org.example;

import org.example.exerc1.*;
import org.example.exerc2.*;
import org.example.exerc3.Circle;
import org.example.exerc3.Rectangle;
import org.example.exerc3.Shapes;
import org.example.exerc3.Square;

import java.util.List;

public class Main {
    static void main() {
        // Exercise 1
        System.out.println("Exercício 1");

        String message = "Feliz Aniversário!";

        List<Message> messageList = List.of(
                new SMS(),
                new Email(),
                new SocialMedia(),
                new WhatsApp()
        );

        messageList.forEach(m -> m.sendMessage(message));

        // Exercise 2
        System.out.println();
        System.out.println("Exercício 2");

        List<ProductTribute> productTributeList = List.of(
                new Food("Banana", 10),
                new Health("Antibiótico", 50),
                new Clothing("Camiseta Polo", 40),
                new Culture("Ingresso para filme", 25)
        );

        productTributeList.forEach(p -> {
            System.out.println(p.toString());
            System.out.println("Valor do tributo: R$" + p.calculateTribute());
            System.out.println("Porcentagem de tributo: " + (100 * p.getTaxValue() + "%"));
            System.out.println();
        });

        // Exercise 3
        System.out.println();
        System.out.println("Exercício 3");

        List<Shapes> shapesList = List.of(
                new Square(10),
                new Rectangle(10, 5),
                new Circle(3)
        );

        shapesList.forEach(shapes -> {
            System.out.println(shapes.toString());
            System.out.println("Área: " + shapes.calculateArea());
            System.out.println();
        });
    }
}
