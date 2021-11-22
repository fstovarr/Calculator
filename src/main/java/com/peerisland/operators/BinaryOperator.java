package com.peerisland.operators;

public abstract class BinaryOperator extends Operator {
    private final Double first;
    private final Double second;

    /**
     * Constructor
     * 
     * @param identifier the identifier of the operator
     * @param first      the first number to be operated
     * @param second     the second number to be operated
     */
    public BinaryOperator(String identifier, Double first, Double second) {
        super(identifier);
        this.first = first;
        this.second = second;
    }

    /**
     * Returns the first number to be operated
     *
     * @return the first number to be operated
     */
    public Double getFirst() {
        return first;
    }

    /**
     * Returns the second number to be operated
     * 
     * @return the second number to be operated
     */
    public Double getSecond() {
        return second;
    }
}
