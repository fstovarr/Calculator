package com.peerisland.operators;

public abstract class UnaryOperator implements Operator {
    private final Double number;

    public UnaryOperator(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }
}
