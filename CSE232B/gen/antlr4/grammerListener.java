// Generated from /Users/ranaalotaibi/Desktop/CSE232B/src/main/resources/antlr4/grammer.g4 by ANTLR 4.9.2
package antlr4;

package edu.ucsd.CSE232B.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammerParser}.
 */
public interface grammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(grammerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(grammerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(grammerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(grammerParser.ExpContext ctx);
}