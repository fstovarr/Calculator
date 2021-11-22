package com.peerisland.operators;

public class Plus extends UnaryOperator {
    public Plus(Double number) {
        super(number);
    }

    @Override
    public Double calculate() {
        return +this.getNumber();
    }
}
