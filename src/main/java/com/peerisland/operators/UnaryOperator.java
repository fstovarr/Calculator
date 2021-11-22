package com.peerisland.operators;

public abstract class UnaryOperator extends Operator {
    private final Double number;

    /**
     * Constructor
     * 
     * @param identifier the identifier of the operator
     * @param number     the number to be operated
     */

    public UnaryOperator(String identifier, Double number) {
        super(identifier);
        this.number = number;
    }

    /**
     * Returns the number to be operated
     * 
     * @return the number to be operated
     */
    public Double getNumber() {
        return number;
    }
}
