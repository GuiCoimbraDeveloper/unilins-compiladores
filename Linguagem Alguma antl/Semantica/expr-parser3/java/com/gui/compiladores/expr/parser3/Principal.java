package com.gui.compiladores.expr.parser3;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author guilh
 */
public class Principal {

    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        ExpressoesLexer lexer = new ExpressoesLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressoesParser parser = new ExpressoesParser(tokens);
        ExpressoesParser.ProgramaContext arvore = parser.programa();
        Calculador c = new Calculador();
        double val = c.visitPrograma(arvore);
        System.out.println("Valor calculado: " + val);
    }
}
