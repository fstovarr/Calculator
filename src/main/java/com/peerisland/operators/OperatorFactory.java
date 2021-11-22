package com.peerisland.operators;

public class OperatorFactory {
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
