package com.peerisland.operators;

public class Minus extends UnaryOperator {
    public static final String IDENTIFIER = "minus";

    public Minus(Double number) {
        super(IDENTIFIER, number);
    }

    @Override
    public Double calculate() {
        return -this.getNumber();
    }
}
