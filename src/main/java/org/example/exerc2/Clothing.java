package org.example.exerc2;

public record Clothing(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.025;

    @Override
    public double calculateTribute() {
        return value * TRIBUTE;
    }

    @Override
    public double getTribute() {
        return TRIBUTE;
    }
}
