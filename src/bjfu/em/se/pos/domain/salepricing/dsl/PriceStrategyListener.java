// Generated from PriceStrategy.g4 by ANTLR 4.5
package bjfu.em.se.pos.domain.salepricing.dsl;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PriceStrategyParser}.
 */
public interface PriceStrategyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PriceStrategyParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(PriceStrategyParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PriceStrategyParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(PriceStrategyParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(PriceStrategyParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(PriceStrategyParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNormalStat(PriceStrategyParser.NormalStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNormalStat(PriceStrategyParser.NormalStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStat(PriceStrategyParser.EmptyStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStat(PriceStrategyParser.EmptyStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareNotBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareNotBoolExpr(PriceStrategyParser.CompareNotBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareNotBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareNotBoolExpr(PriceStrategyParser.CompareNotBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrBoolExpr(PriceStrategyParser.OrBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrBoolExpr(PriceStrategyParser.OrBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareBoolExpr(PriceStrategyParser.CompareBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareBoolExpr(PriceStrategyParser.CompareBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentheseBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterParentheseBoolExpr(PriceStrategyParser.ParentheseBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentheseBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitParentheseBoolExpr(PriceStrategyParser.ParentheseBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndBoolExpr(PriceStrategyParser.AndBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndBoolExpr(PriceStrategyParser.AndBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(PriceStrategyParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(PriceStrategyParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(PriceStrategyParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(PriceStrategyParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentheseExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheseExpr(PriceStrategyParser.ParentheseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentheseExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheseExpr(PriceStrategyParser.ParentheseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(PriceStrategyParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(PriceStrategyParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(PriceStrategyParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(PriceStrategyParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterDiscountStrategy(PriceStrategyParser.DiscountStrategyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitDiscountStrategy(PriceStrategyParser.DiscountStrategyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterMinusStrategy(PriceStrategyParser.MinusStrategyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitMinusStrategy(PriceStrategyParser.MinusStrategyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsoluteMinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteMinusStrategy(PriceStrategyParser.AbsoluteMinusStrategyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsoluteMinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteMinusStrategy(PriceStrategyParser.AbsoluteMinusStrategyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoDiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void enterNoDiscountStrategy(PriceStrategyParser.NoDiscountStrategyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoDiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 */
	void exitNoDiscountStrategy(PriceStrategyParser.NoDiscountStrategyContext ctx);
}