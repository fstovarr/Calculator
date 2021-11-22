package com.peerisland.operators;

public class Multiplication extends BinaryOperator {

    public Multiplication(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() * this.getSecond();
    }

}
