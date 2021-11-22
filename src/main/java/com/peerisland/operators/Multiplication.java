package com.peerisland.operators;

public class Multiplication extends BinaryOperator {
    public static final String IDENTIFIER = "into";

    public Multiplication(Double first, Double second) {
        super(IDENTIFIER, first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() * this.getSecond();
    }
}
