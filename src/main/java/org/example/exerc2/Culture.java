package org.example.exerc2;

public record Culture(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.04;

    @Override
    public double calculateTribute() {
        return value * TRIBUTE;
    }

    @Override
    public double getTribute() {
        return TRIBUTE;
    }
}
