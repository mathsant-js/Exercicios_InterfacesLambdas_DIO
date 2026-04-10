package org.example.exerc3;

public record Square(double side) implements Shapes {
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Forma Geométrica: Quadrado | Valor do lado: " + side;
    }
}
