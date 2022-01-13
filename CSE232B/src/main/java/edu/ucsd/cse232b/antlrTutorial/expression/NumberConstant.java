package edu.ucsd.cse232b.antlrTutorial.expression;

import java.util.Objects;

/**
 * Number
 */
public class NumberConstant implements Expression {
    final int Value;

    public NumberConstant(int integer) {
        this.Value = integer;
    }

    public int getInteger() {
        return Value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        NumberConstant that = (NumberConstant) o;
        return Objects.equals(Value, that.Value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Value);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.EXPR_NUMBER;
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(Value);
        return str.toString();
    }
}
