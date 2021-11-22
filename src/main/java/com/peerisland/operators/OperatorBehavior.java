package com.peerisland.operators;

/**
 * Interface to abstract the operators' behavior
 */
public interface OperatorBehavior {

    /**
     * It returns the answer of the operation
     * 
     * @return the result of the operation
     */
    public Double calculate();

    /**
     * It returns the identifier of the operator
     * 
     * @return the identifier of the operator
     */
    public String getIdentifier();
}
