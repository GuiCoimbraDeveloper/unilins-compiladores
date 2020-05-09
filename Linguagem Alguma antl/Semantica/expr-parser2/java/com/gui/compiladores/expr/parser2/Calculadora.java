/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.compiladores.expr.parser2;

/**
 *
 * @author guilh
 */
public class Calculadora extends ExpressoesBaseVisitor<Double> {

    @Override
    public Double visitPrograma(ExpressoesParser.ProgramaContext ctx) {
        return visitExpressao(ctx.expressao());
    }

    @Override
    public Double visitExpressao(ExpressoesParser.ExpressaoContext ctx) {
        double valor = visitTermo(ctx.termo1);
        for (int i = 0; i < ctx.outrosTermos.size(); i++) {
            ExpressoesParser.Op1Context op1 = ctx.op1(i);
            ExpressoesParser.TermoContext ot = ctx.outrosTermos.get(i);
            String strOp1 = op1.getText();
            if (strOp1.equals("+")) {
                valor += visitTermo(ot);
            } else {
                valor -= visitTermo(ot);
            }
        }
        return valor;
    }

    @Override
    public Double visitTermo(ExpressoesParser.TermoContext ctx) {
        double valor = visitFator(ctx.fator1);
        for (int i = 0; i < ctx.outrosFatores.size(); i++) {
            ExpressoesParser.Op2Context op2 = ctx.op2(i);
            ExpressoesParser.FatorContext of = ctx.outrosFatores.get(i);
            String strOp2 = op2.getText();
            if (strOp2.equals("*")) {
                valor *= visitFator(of);
            } else {
                valor /= visitFator(of);
            }
        }
        return valor;
    }

    @Override
    public Double visitFator(ExpressoesParser.FatorContext ctx) {
        if (ctx.NUM() != null) {
            return Double.parseDouble(ctx.NUM().getText());
        } else {
            return visitExpressao(ctx.expressao());
        }
    }

}
