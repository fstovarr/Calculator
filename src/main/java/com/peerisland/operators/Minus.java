package com.peerisland.operators;

public class Minus extends UnaryOperator {
    public Minus(Double number) {
        super(number);
    }

    @Override
    public Double calculate() {
        return -this.getNumber();
    }
}
