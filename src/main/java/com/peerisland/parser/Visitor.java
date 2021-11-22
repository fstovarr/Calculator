package com.peerisland.parser;

import com.peerisland.parser.generated.CalculatorBaseVisitor;
import com.peerisland.parser.generated.CalculatorParser.FirstOrderOpsContext;
import com.peerisland.parser.generated.CalculatorParser.NumberContext;
import com.peerisland.parser.generated.CalculatorParser.SecondOrderOpsContext;

public class Visitor extends CalculatorBaseVisitor<Double> {
    @Override
    public Double visitFirstOrderOps(FirstOrderOpsContext ctx) {
        System.out.println("visitFirstOrderOps" + ctx.getText());
        return this.visit(ctx.first) * this.visit(ctx.second);
    }

    @Override
    public Double visitSecondOrderOps(SecondOrderOpsContext ctx) {
        System.out.println("visitSecondOrderOps" + ctx.getText());
        return this.visit(ctx.first) + this.visit(ctx.second);
    }

    @Override
    public Double visitNumber(NumberContext ctx) {
        return Double.parseDouble(ctx.NUMBER().getText());
    }
}
