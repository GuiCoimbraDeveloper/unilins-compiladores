/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algumalex;

/**
 *
 * @author guilh
 */
public class AlgumaLex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        Token t = null;
        
        while((t = lex.proximoToken()) != null){
            System.out.println(t);
        }
    }
    
}