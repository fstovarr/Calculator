package com.peerisland.operators;

public class Substraction extends BinaryOperator {
    public static final String IDENTIFIER = "minus";

    public Substraction(Double first, Double second) {
        super(IDENTIFIER, first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() - this.getSecond();
    }
}
