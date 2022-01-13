package edu.ucsd.cse232b.antlrTutorial.Visitor;

import java.util.ArrayList;
import java.util.List;

import edu.ucsd.CSE232B.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.ExpContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.ProgContext;
import edu.ucsd.cse232b.antlrTutorial.expression.Expression;
import edu.ucsd.cse232b.antlrTutorial.expression.Prog;

public class ProgramBuilder extends ExpressionGrammarBaseVisitor<Prog> {
    @Override
    public Prog visitProg(ProgContext ctx){
        final List<Expression> expressionList = new ArrayList<>();
        final ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        for (ExpContext context:ctx.exp()){
            final Expression expression = expressionBuilder.visit(context);
            expressionList.add(expression);
        }
        final Prog prog = new Prog(expressionList);
        return prog;
    }
}
