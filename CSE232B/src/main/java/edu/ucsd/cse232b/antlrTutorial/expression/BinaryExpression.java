package edu.ucsd.cse232b.antlrTutorial.expression;

import java.util.Objects;

/**
 * Binary Expression
 */
public class BinaryExpression implements Expression {
    final Expression left;
    final Operator operator;
    final Expression right;

    /**
     * Constructor
     * @param left left expression
     * @param opertor operator
     * @param right right expression
     */
    public BinaryExpression(Expression left, Operator opertor, Expression right) {
        this.left = left;
        this.operator = opertor;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Operator getOpertor() {
        return operator;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BinaryExpression that = (BinaryExpression) o;
        return Objects.equals(left, that.left) && operator == that.operator && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, operator, right);
    }

    @Override
    public String toString() {
       final StringBuilder str = new StringBuilder();
       str.append(left.toString());
       str.append(operator.toString());
       str.append(right.toString());
       return str.toString();
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.EXPR_BINARY;
    }
}
