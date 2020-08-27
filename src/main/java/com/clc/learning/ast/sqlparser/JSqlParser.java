package com.clc.learning.ast.sqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.util.deparser.ExpressionDeParser;

import java.util.List;

/**
 * JSqlParser 是sql的语法分析工具，可以对sql语法进行解析
 */
public class JSqlParser {
    public static void main(String[] args) {
        String sql = "select *from A as a left join B on a.bid = B.id left join " +
                "C on A.cid = C.id left join D on B.did = D.id";
        String sql2 = "select *from A as a left join B on a.bid = B.id left join C on A.cid = C.id left join D on B.did = D.id where a.id = 23  and ( b.id = 34 or c.id = 54)";

        try {
            Select select = (Select) CCJSqlParserUtil.parse(sql);
            SelectBody selectBody = select.getSelectBody();
            PlainSelect plainSelect = (PlainSelect) selectBody;
            List<Join> joins = plainSelect.getJoins();
            for (Join join : joins) {
                EqualsTo equalsTo = (EqualsTo) join.getOnExpression();
                Column leftExpression = (Column) equalsTo.getLeftExpression();
                Column rightExpression = (Column) equalsTo.getRightExpression();

                System.out.println("left table name:" + leftExpression.getTable());
                System.out.println("left table field:" + leftExpression.getColumnName());
                System.out.println("right table name:" + rightExpression.getTable());
                System.out.println("right table field:" + rightExpression.getColumnName());
                System.out.println("---------------------");
            }

             select = (Select)CCJSqlParserUtil.parse(sql2);
             selectBody = select.getSelectBody();
             plainSelect = (PlainSelect)selectBody;

            Expression where = plainSelect.getWhere();
            ExpressionDeParser expressionDeParser = new ExpressionDeParser();
            plainSelect.getWhere().accept(expressionDeParser);

            // 此处根据where实际情况强转 最外层
            if(where instanceof OrExpression){
                //todo 需要增加根据不同类型判断处理，可能是有and 和 or结合的where条件
            }
            OrExpression orExpression = (OrExpression)where;

            OrExpression leftOrExpression = (OrExpression)orExpression.getLeftExpression();

            EqualsTo equalsTo = (EqualsTo)leftOrExpression.getLeftExpression();

            System.out.println("Table:"+((Column)equalsTo.getLeftExpression()).getTable());
            System.out.println("Field:"+((Column)equalsTo.getLeftExpression()).getColumnName());
            System.out.println("equal:"+equalsTo.getRightExpression());
            System.out.println("-----------------");
            equalsTo = (EqualsTo)leftOrExpression.getRightExpression();

            System.out.println("Table:"+((Column)equalsTo.getLeftExpression()).getTable());
            System.out.println("Field:"+((Column)equalsTo.getLeftExpression()).getColumnName());
            System.out.println("equal:"+equalsTo.getRightExpression());
            System.out.println("-----------------");
            equalsTo = (EqualsTo)orExpression.getRightExpression();

            System.out.println("Table:"+((Column)equalsTo.getLeftExpression()).getTable());
            System.out.println("Field:"+((Column)equalsTo.getLeftExpression()).getColumnName());
            System.out.println("equal:"+equalsTo.getRightExpression());

        } catch (JSQLParserException e) {
            e.printStackTrace();

        }
    }
}