import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class EvalVisitor{

  public static void main(String[] args) throws Exception {

    CharStream input;
    if (args.length > 0)
      input = CharStreams.fromFileName(args[0]);
    else
      input = CharStreams.fromStream(System.in);
      
    ListLexer lexer = new ListLexer(input);
    ListParser parse = new ListParser(new CommonTokenStream(lexer));
    ParseTree tree = parse.programa();
    Eval eval = new Eval();
    System.out.println(eval.visit(tree));

  }
  
}
