package com.peerisland.operators;

public abstract class BinaryOperator extends Operator {
    private final Double first;
    private final Double second;

    public BinaryOperator(String identifier, Double first, Double second) {
        super(identifier);
        this.first = first;
        this.second = second;
    }

    public Double getSecond() {
        return second;
    }

    public Double getFirst() {
        return first;
    }
}
