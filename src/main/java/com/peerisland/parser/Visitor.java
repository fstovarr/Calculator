package com.peerisland.parser;

import java.util.List;

import com.peerisland.operators.BinaryOperator;
import com.peerisland.operators.Operator;
import com.peerisland.operators.OperatorFactory;
import com.peerisland.parser.generated.CalculatorBaseVisitor;
import com.peerisland.parser.generated.CalculatorParser;
import com.peerisland.parser.generated.CalculatorParser.FirstOrderOpsContext;
import com.peerisland.parser.generated.CalculatorParser.GroupingOpContext;
import com.peerisland.parser.generated.CalculatorParser.LineContext;
import com.peerisland.parser.generated.CalculatorParser.NumberContext;
import com.peerisland.parser.generated.CalculatorParser.SecondOrderOpsContext;
import com.peerisland.parser.generated.CalculatorParser.StartContext;
import com.peerisland.parser.generated.CalculatorParser.UnaryOpsContext;
import com.peerisland.util.AnswerParser;

public class Visitor extends CalculatorBaseVisitor<String> {

    @Override
    public String visitGroupingOp(GroupingOpContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public String visitFirstOrderOps(FirstOrderOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.first),
                this.visit(ctx.second));
        return operator.calculate().toString();
    }

    @Override
    public String visitSecondOrderOps(SecondOrderOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.first),
                this.visit(ctx.second));
        return operator.calculate().toString();
    }

    @Override
    public String visitNumber(NumberContext ctx) {
        return ctx.NUMBER().getText();
    }

    @Override
    public String visitUnaryOps(UnaryOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.number));
        return operator.calculate().toString();
    }

    @Override
    public String visitLine(LineContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public String visitStart(StartContext ctx) {
        List<LineContext> lines = ctx.line();

        StringBuilder sb = new StringBuilder();

        for (LineContext line : lines) {
            String answer = this.visit(line);
            sb.append(AnswerParser.parseAnswer(line.getText(), answer) + "\n");
        }

        return sb.toString();
    }
}
