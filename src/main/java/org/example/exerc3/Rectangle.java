package org.example.exerc3;

public record Rectangle(double base, double height) implements Shapes {
    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public String toString() {
        return "Forma Geométrica: Retângulo | Valor da Base: " + base + " | Valor da Altura: " + height;
    }
}
