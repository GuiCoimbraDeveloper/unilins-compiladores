package algumaparsersin;

import algumalex.AlgumaLexico;

/**
 *
 * @author guilh
 */
public class Principal {

    public static void main(String args[]) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        AlgumaParserSin parser = new AlgumaParserSin(lex);
        parser.programa();
    }
}
