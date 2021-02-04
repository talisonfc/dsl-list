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
	 * Visit a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ListParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code show}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(ListParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNested}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNested(ListParser.ExpNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expSum}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSum(ListParser.ExpSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ListParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ListParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ListParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collection}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(ListParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ListParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ListParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(ListParser.ListaContext ctx);
}