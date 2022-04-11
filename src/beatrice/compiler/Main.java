package beatrice.compiler;

import beatrice.codeGenerateur.CodeGenerateur;
import beatrice.lexer.Lexer;
import beatrice.lexer.LexerException;
import beatrice.node.Start;
import beatrice.parser.Parser;
import beatrice.parser.ParserException;
import beatrice.semantic.Semantic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.HashMap;

public class Main {

    public static HashMap<String,String> table_symboles = new HashMap<String,String>();

    public static void main(String[] args) throws ParserException, IOException, LexerException {
        System.out.println("hello");

        Lexer lexical = new Lexer(
                new PushbackReader(
                    new InputStreamReader(System.in), 1024));

        Parser syntaxique = new Parser(lexical);
        Start arbre = syntaxique.parse();
        arbre.apply(new Semantic());
        arbre.apply(new CodeGenerateur());
        System.out.println(table_symboles);
        System.out.println("Success");
    }
}
