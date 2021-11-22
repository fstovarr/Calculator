package com.peerisland.operators;

public class Addition extends BinaryOperator {
    public static final String IDENTIFIER = "plus";

    public Addition(Double first, Double second) {
        super(IDENTIFIER, first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() + this.getSecond();
    }
}
