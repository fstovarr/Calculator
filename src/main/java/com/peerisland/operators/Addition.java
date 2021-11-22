package com.peerisland.operators;

public class Addition extends BinaryOperator {

    public Addition(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() + this.getSecond();
    }
}
