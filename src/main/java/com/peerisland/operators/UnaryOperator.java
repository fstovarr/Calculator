package com.peerisland.operators;

public abstract class UnaryOperator extends Operator {
    private final Double number;

    public UnaryOperator(String identifier, Double number) {
        super(identifier);
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }
}
