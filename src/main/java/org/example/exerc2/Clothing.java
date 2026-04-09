package org.example.exerc2;

public record Clothing(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.025;

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
