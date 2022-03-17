package beatrice.compiler;

import beatrice.lexer.Lexer;
import beatrice.lexer.LexerException;
import beatrice.node.Start;
import beatrice.parser.Parser;
import beatrice.parser.ParserException;
import beatrice.semantic.Semantic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class Main {

    public static void main(String[] args) throws ParserException, IOException, LexerException {
        System.out.println("hello");

        Lexer lexical = new Lexer(
                new PushbackReader(
                    new InputStreamReader(System.in), 1024));

        Parser syntaxique = new Parser(lexical);
        Start arbre = syntaxique.parse();
        arbre.apply(new Semantic());
        String x = "caractere";
        if (x.equals("caractere")){
            System.out.println("caractereeeeeeeeeee");
        }
    }
}
