package com.peerisland.operators;

public abstract class BinaryOperator implements Operator {
    private final Double first;
    private final Double second;

    public BinaryOperator(Double first, Double second) {
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
