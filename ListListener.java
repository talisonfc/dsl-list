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
	 * Enter a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ListParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresion}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ListParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code show}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterShow(ListParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code show}
	 * labeled alternative in {@link ListParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitShow(ListParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNested}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNested(ListParser.ExpNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNested}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNested(ListParser.ExpNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expSum}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpSum(ListParser.ExpSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expSum}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpSum(ListParser.ExpSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterName(ListParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitName(ListParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ListParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ListParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ListParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ListParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collection}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCollection(ListParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collection}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCollection(ListParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(ListParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ListParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(ListParser.IntContext ctx);
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