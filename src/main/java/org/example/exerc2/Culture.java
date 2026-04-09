package org.example.exerc2;

public record Culture(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.04;

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
