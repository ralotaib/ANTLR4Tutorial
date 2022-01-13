package edu.ucsd.cse232b.antlrTutorial.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Program
 */
public class Prog {
    final List<Expression> expressionList;

    public Prog() {
        this.expressionList = new ArrayList<>();
    }

    public Prog(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    public void addExpression(final Expression expression) {
        expressionList.add(expression);
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Prog prog = (Prog) o;
        return Objects.equals(expressionList, prog.expressionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expressionList);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        for (Expression expression : expressionList) {
            str.append(expression.toString());
            str.append("\n");
        }
        return str.toString();
    }
}
