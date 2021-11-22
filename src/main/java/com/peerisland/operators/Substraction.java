package com.peerisland.operators;

public class Substraction extends BinaryOperator {

    public Substraction(Double first, Double second) {
        super(first, second);
    }

    @Override
    public Double calculate() {
        return this.getFirst() - this.getSecond();
    }

}
