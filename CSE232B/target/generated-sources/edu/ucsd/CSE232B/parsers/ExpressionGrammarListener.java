// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.CSE232B.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Number}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Number(ExpressionGrammarParser.Expr_NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Number}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Number(ExpressionGrammarParser.Expr_NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Binary}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Binary(ExpressionGrammarParser.Expr_BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Binary}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Binary(ExpressionGrammarParser.Expr_BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Variable(ExpressionGrammarParser.Expr_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Variable(ExpressionGrammarParser.Expr_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expr_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Parentheses(ExpressionGrammarParser.Expr_ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expr_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Parentheses(ExpressionGrammarParser.Expr_ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpressionGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpressionGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExpressionGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExpressionGrammarParser.VariableContext ctx);
}