package com.peerisland.operators;

public abstract class Operator implements OperatorBehavior {
    private final String identifier;

    public Operator(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
