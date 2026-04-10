package org.example.exerc3;

public record Circle(double radius) implements Shapes {
    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Forma Geométrica: Círculo | Valor do raio: " + radius;
    }
}
