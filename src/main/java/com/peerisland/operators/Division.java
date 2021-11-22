package com.peerisland.operators;

public class Division extends BinaryOperator {
    public static final String IDENTIFIER = "divide";

    public Division(Double first, Double second) {
        super(IDENTIFIER, first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() / this.getSecond();
    }
}
