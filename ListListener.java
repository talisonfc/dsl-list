// Generated from List.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ListParser}.
 */
public interface ListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ListParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ListParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ListParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(ListParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(ListParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ListParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ListParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(ListParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(ListParser.ListaContext ctx);
}