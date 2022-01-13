package edu.ucsd.cse232b.antlrTutorial.visitor;

import edu.ucsd.CSE232B.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_BinaryContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_NumberContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_ParenthesesContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_VariableContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.NumberContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.VariableContext;
import edu.ucsd.cse232b.antlrTutorial.expression.BinaryExpression;
import edu.ucsd.cse232b.antlrTutorial.expression.Expression;
import edu.ucsd.cse232b.antlrTutorial.expression.NumberConstant;
import edu.ucsd.cse232b.antlrTutorial.expression.Operator;
import edu.ucsd.cse232b.antlrTutorial.expression.ParaExpression;
import edu.ucsd.cse232b.antlrTutorial.expression.Variable;

public class ExpressionBuilder extends ExpressionGrammarBaseVisitor<Expression> {

    @Override
    public Expression visitExpr_Binary(Expr_BinaryContext ctx) {
        final Expression expressionLeft = visit(ctx.exp(0));
        final Operator operator = Operator.fromString(ctx.OP().getText());
        final Expression expressionRight = visit(ctx.exp(1));
        return  new BinaryExpression(expressionLeft,operator,expressionRight);
    }

    @Override
    public Expression visitExpr_Parentheses(Expr_ParenthesesContext ctx) {
        final Expression expression = visit(ctx.exp());
        return new ParaExpression(expression);
    }

    @Override
    public Expression visitExpr_Number(Expr_NumberContext ctx) {
        final Expression number = visit(ctx.number());
        return number;
    }

    @Override
    public Expression visitNumber(NumberContext ctx) {
        final int number = Integer.valueOf(ctx.NUM().getText());
        final NumberConstant numberConstant = new NumberConstant(number);
        return numberConstant;
    }

    @Override
    public Expression visitExpr_Variable(Expr_VariableContext ctx) {
        final Expression variable = visit(ctx.variable());
        return variable;
    }
    @Override
    public Expression visitVariable(VariableContext ctx) {
        final String name = ctx.ID().getText();
        final Variable variable = new Variable(name);
        return variable;
    }
}
