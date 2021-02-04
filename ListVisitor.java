// Generated from List.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ListParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ListParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ListParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(ListParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ListParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(ListParser.ListaContext ctx);
}