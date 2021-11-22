package com.peerisland.operators;

/**
 * Base class to abstract all the operators
 */
public abstract class Operator implements OperatorBehavior {
    private final String identifier;

    /**
     * Constructor
     * 
     * @param identifier the identifier of the operator
     */
    public Operator(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Returns the identifier of the operator
     * 
     * @return the identifier of the operator
     */
    public String getIdentifier() {
        return identifier;
    }
}
