package edu.ucsd.cse232b.antlrTutorial.expression;

import java.util.Objects;

/**
 * Variable
 */
public class Variable implements Expression {
    final String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.EXPR_VARIABLE;
    }
}
