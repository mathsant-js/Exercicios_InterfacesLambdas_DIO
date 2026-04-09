package org.example.exerc2;

public record Health(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.015;

    @Override
    public double calculateTribute() {
        return value * TRIBUTE;
    }

    @Override
    public double getTribute() {
        return TRIBUTE;
    }
}
