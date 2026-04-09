package org.example.exerc2;

public interface ProductTribute {

    String name();
    double value();

    double getValue();
    double getTaxValue();

    default double calculateTribute() {
        return getValue() * getTaxValue();
    }

    default String toStringStandard() {
        return "Produto: " + name() + " | Valor: R$" + value();
    }
}
