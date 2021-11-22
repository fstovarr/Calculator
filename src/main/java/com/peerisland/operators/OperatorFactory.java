package com.peerisland.operators;

public class OperatorFactory {

    /**
     * Returns the operator with the given identifier for unary operators
     * 
     * @param operator the identifier of the operator
     * @param str      the number to be used in the operation
     * @return an instance of the requested operator
     */
    public static Operator createOperator(String operator, String str) {
        Double number = Double.parseDouble(str);
        switch (operator) {
        case Plus.IDENTIFIER:
            return new Plus(number);
        case Minus.IDENTIFIER:
            return new Minus(number);
        default:
            throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }

    /**
     * Returns the operator with the given identifier for binary operators
     * 
     * @param operator  the identifier of the operator
     * @param firstStr  the first number to be used in the operation
     * @param secondStr the second number to be used in the operation
     * @return an instance of the requested operator
     */

    public static Operator createOperator(String operator, String firstStr, String secondStr) {
        Double first = Double.parseDouble(firstStr);
        Double second = Double.parseDouble(secondStr);
        switch (operator) {
        case Addition.IDENTIFIER:
            return new Addition(first, second);
        case Substraction.IDENTIFIER:
            return new Substraction(first, second);
        case Division.IDENTIFIER:
            return new Division(first, second);
        case Multiplication.IDENTIFIER:
            return new Multiplication(first, second);
        default:
            throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }
}
