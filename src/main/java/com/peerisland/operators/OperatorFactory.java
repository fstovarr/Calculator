package com.peerisland.operators;

public class OperatorFactory {
    public static OperatorBehavior createOperator(String operator, Double number) {
        switch (operator) {
        case Plus.IDENTIFIER:
            return new Plus(number);
        case Minus.IDENTIFIER:
            return new Minus(number);
        default:
            throw new IllegalArgumentException("Operator " + operator + " is not supported");
        }
    }

    public static OperatorBehavior createOperator(String operator, Double first, Double second) {
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
