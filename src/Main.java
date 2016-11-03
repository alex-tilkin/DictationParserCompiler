import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main 
{
    public static void main( String[] args) throws Exception 
    {
    	String context = "create public static method go and stop that accepts name of type string and age and id of type int returns void";
        ANTLRInputStream input = new ANTLRInputStream(context);
        DictationParserLexer lexer = new DictationParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParseTreeWalker walker = new ParseTreeWalker();
        DictationParserParser parser = new DictationParserParser(tokens);
        ParseTree tree = parser.command(); // begin parsing at rule 'r'
        DictationParser listener = new DictationParser();
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        walker.walk(listener, tree);
    }
}