package com.peerisland.operators;

public class Plus extends UnaryOperator {
    public static final String IDENTIFIER = "plus";

    public Plus(Double number) {
        super(IDENTIFIER, number);
    }

    @Override
    public Double calculate() {
        return +this.getNumber();
    }
}
