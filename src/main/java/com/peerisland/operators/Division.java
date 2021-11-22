package com.peerisland.operators;

public class Division extends BinaryOperator {
    public Division(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() / this.getSecond();
    }
}
