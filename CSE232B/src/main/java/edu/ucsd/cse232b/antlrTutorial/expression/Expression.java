package edu.ucsd.cse232b.antlrTutorial.expression;

/**
 * Expression Interface
 */
public interface Expression {

    ExpressionKind getExpressionKind();
    enum ExpressionKind {
        EXPR_BINARY,
        EXPR_VARIABLE,
        EXPR_NUMBER,
        EXPR_PARA;
    }
}
