package org.example.exerc2;

public record Health(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.015;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double getTaxValue() {
        return TRIBUTE;
    }

    @Override
    public String toString() {
        return toStringStandard();
    }
}
