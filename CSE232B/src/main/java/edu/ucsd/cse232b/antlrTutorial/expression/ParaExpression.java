package edu.ucsd.cse232b.antlrTutorial.expression;

import java.util.Objects;

/**
 * Parentheses Expression
 */
public class ParaExpression implements Expression {
    final Expression expression;

    public ParaExpression(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ParaExpression that = (ParaExpression) o;
        return Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.EXPR_PARA;
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append("(");
        str.append(expression);
        str.append(")");
        return str.toString();
    }
}
