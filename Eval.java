import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eval extends ListBaseVisitor<String> {

  Map<String, String> memory = new HashMap<String, String>();
  List<String> erros = new ArrayList<String>();
  
  /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPrograma(ListParser.ProgramaContext ctx) { 

		String prog = "import numpy as np\n";
		for(ListParser.ComandoContext cmd : ctx.comando()){
			prog += visit(cmd) + "\n";
		}

    if(erros.size() > 0){
      return String.join("\n", erros);
    }
		return prog;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExpresion(ListParser.ExpresionContext ctx) {
    String value = visit(ctx.exp());
    memory.putIfAbsent(ctx.NOME().getText(), value);
		return ctx.NOME().getText() + "=" + value;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitShow(ListParser.ShowContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExpNested(ListParser.ExpNestedContext ctx) { 
		String left = visit(ctx.exp(0));
		String right = visit(ctx.exp(1));
		return String.format("print(%s + %s)", left, right);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExpSum(ListParser.ExpSumContext ctx) { 
		String left = visit(ctx.exp(0));
		String right = visit(ctx.exp(1));

    if(!memory.containsKey(left)) erros.add(String.format("%s not found", left));
    if(!memory.containsKey(right)) erros.add(String.format("%s not found", right));

    return String.format("print(np.add(%s,%s))", left, right);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitName(ListParser.NameContext ctx) { 
    memory.putIfAbsent(ctx.NOME().getText(), "");
		return ctx.NOME().getText(); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFalse(ListParser.FalseContext ctx) { 
		return "0";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitTrue(ListParser.TrueContext ctx) { 
		return "1"; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitCollection(ListParser.CollectionContext ctx) { 

    return visitChildren(ctx); 
  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitInt(ListParser.IntContext ctx) { 
    return ctx.INT().getText(); 
  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitLista(ListParser.ListaContext ctx) { 

    List<String> values = new ArrayList<String>();

    for(ListParser.ExpContext exp : ctx.exp()){
      values.add(visit(exp));
    }

    return "[" + String.join(",", values) + "]";
    // return visitChildren(ctx); 
  }

}
