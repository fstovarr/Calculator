package com.peerisland.parser.generated;

// Generated from Calculator.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CalculatorParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstOrderOps}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstOrderOps(CalculatorParser.FirstOrderOpsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SecondOrderOps}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondOrderOps(CalculatorParser.SecondOrderOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#first_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_op(CalculatorParser.First_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#second_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_op(CalculatorParser.Second_opContext ctx);
}