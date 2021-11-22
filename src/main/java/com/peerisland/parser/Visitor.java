package com.peerisland.parser;

import java.util.List;

import com.peerisland.operators.Operator;
import com.peerisland.operators.OperatorFactory;
import com.peerisland.parser.generated.CalculatorBaseVisitor;
import com.peerisland.parser.generated.CalculatorParser.FirstOrderOpsContext;
import com.peerisland.parser.generated.CalculatorParser.GroupingOpContext;
import com.peerisland.parser.generated.CalculatorParser.LineContext;
import com.peerisland.parser.generated.CalculatorParser.NumberContext;
import com.peerisland.parser.generated.CalculatorParser.SecondOrderOpsContext;
import com.peerisland.parser.generated.CalculatorParser.StartContext;
import com.peerisland.parser.generated.CalculatorParser.UnaryOpsContext;
import com.peerisland.util.AnswerParser;

public class Visitor extends CalculatorBaseVisitor<String> {

    /**
     * Handles the case when the expression is surrounded by parenthesis
     * 
     * @param ctx the tree context
     * @return the result of the expression
     */
    @Override
    public String visitGroupingOp(GroupingOpContext ctx) {
        return this.visit(ctx.expression());
    }

    /**
     * Handles the case when the expression contains a first order operator ( * or
     * /)
     * 
     * @param ctx the tree context
     * @return the result of the expression
     */
    @Override
    public String visitFirstOrderOps(FirstOrderOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.first),
                this.visit(ctx.second));
        return operator.calculate().toString();
    }

    /**
     * Handles the case when the expression contains a second order operator (+ or
     * -)
     * 
     * @param ctx the tree context
     * @return the result of the expression
     */
    @Override
    public String visitSecondOrderOps(SecondOrderOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.first),
                this.visit(ctx.second));
        return operator.calculate().toString();
    }

    /**
     * Handles the case when the expression is a single number
     * 
     * @param ctx the tree context
     * @return the number
     */
    @Override
    public String visitNumber(NumberContext ctx) {
        return ctx.NUMBER().getText();
    }

    /**
     * Handles the case when the expression contains a unary operator ( + or -)
     * 
     * @param ctx the tree context
     * @return the result of the expression
     */
    @Override
    public String visitUnaryOps(UnaryOpsContext ctx) {
        Operator operator = OperatorFactory.createOperator(ctx.operator.getText(), this.visit(ctx.number));
        return operator.calculate().toString();
    }

    /**
     * Handles the case when the expression is an expression preceded or followed
     * with whitespaces or semicolons (;)
     * 
     * @param ctx the tree context
     * @return the result of the expression
     */
    @Override
    public String visitLine(LineContext ctx) {
        return this.visit(ctx.expression());
    }

    /**
     * Entry point in the tree. It takes the answer of each operation and returns a
     * concatenation of all the strings separated by a new line
     * 
     * @param ctx the tree context
     * @return the final answer to be printed on screen
     */

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
