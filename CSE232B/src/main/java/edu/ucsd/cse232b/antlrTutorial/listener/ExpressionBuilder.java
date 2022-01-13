package edu.ucsd.cse232b.antlrTutorial.listener;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;


import edu.ucsd.CSE232B.parsers.ExpressionGrammarBaseListener;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.ExpContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_BinaryContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_NumberContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_ParenthesesContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.Expr_VariableContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.NumberContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.ProgContext;
import edu.ucsd.CSE232B.parsers.ExpressionGrammarParser.VariableContext;
import edu.ucsd.cse232b.antlrTutorial.expression.BinaryExpression;
import edu.ucsd.cse232b.antlrTutorial.expression.Expression;
import edu.ucsd.cse232b.antlrTutorial.expression.NumberConstant;
import edu.ucsd.cse232b.antlrTutorial.expression.Operator;
import edu.ucsd.cse232b.antlrTutorial.expression.ParaExpression;
import edu.ucsd.cse232b.antlrTutorial.expression.Prog;
import edu.ucsd.cse232b.antlrTutorial.expression.Variable;

public class ExpressionBuilder extends ExpressionGrammarBaseListener {
    private ParseTreeProperty<Object> expressionObjects;

    /**
     * Constructor
     */
    public ExpressionBuilder() {
        expressionObjects = new ParseTreeProperty<Object>();
    }

    /**
     * Set object (parser tree property)
     *
     * @param subtree subtree
     * @param obj  corresponding object
     */
    private void setObject(ParseTree subtree, Object obj) {
        expressionObjects.put(subtree, obj);
    }

    /**
     * Retrieve object from parser tree property
     *
     * @param obj
     * @return expression object
     */
    private Object retrieveObject(ParseTree obj) {
        return expressionObjects.get(obj);
    }

    public Prog getProg(ParseTree tree){
        return (Prog) retrieveObject(tree);
    }
    @Override
    public void exitProg(ProgContext ctx){
        final List<Expression> expressionList = new ArrayList<>();
        for (ExpContext expressionContext: ctx.exp()){
            final Expression expression = (Expression) retrieveObject(expressionContext);
            expressionList.add(expression);
        }
        final Prog program = new Prog(expressionList);
        setObject(ctx,program);
    }
    @Override
    public void exitExpr_Parentheses(Expr_ParenthesesContext ctx){
        final Expression expression = (Expression) retrieveObject(ctx.exp());
        final ParaExpression paraExpression = new ParaExpression(expression);
        setObject(ctx,paraExpression);
    }
    @Override
    public void exitExpr_Binary (Expr_BinaryContext ctx){
        //Left Expression
        final Expression expressionLeft = (Expression) retrieveObject(ctx.exp(0));
        //Operator
        final Operator operator = Operator.fromString(ctx.OP().getText());
       //Right Expression
        final Expression expressionRight = (Expression) retrieveObject(ctx.exp(1));

        final BinaryExpression binaryExpression = new BinaryExpression(expressionLeft,operator,expressionRight);
        setObject(ctx,binaryExpression);
    }


    @Override
    public void exitExpr_Number (Expr_NumberContext ctx){
        final NumberConstant value = (NumberConstant) retrieveObject(ctx.number());
        setObject(ctx,value);
    }

    @Override
    public void exitNumber(NumberContext ctx) {
        final Integer value = Integer.valueOf(ctx.NUM().getText());
        final NumberConstant numberConstant = new NumberConstant(value);
        setObject(ctx,numberConstant);
    }

    @Override
    public void exitExpr_Variable (Expr_VariableContext ctx){
        final Variable variable = (Variable) retrieveObject(ctx.variable());
        setObject(ctx,variable);
    }
    @Override
    public void exitVariable(VariableContext ctx) {
       final String name = ctx.ID().getText();
       final Variable variable  = new Variable(name);
       setObject(ctx,variable);
    }
}
