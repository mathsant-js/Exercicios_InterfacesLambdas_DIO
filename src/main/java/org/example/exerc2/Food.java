package org.example.exerc2;

public record Food(String name, double value) implements ProductTribute {

    private static final double TRIBUTE = 0.01;

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
