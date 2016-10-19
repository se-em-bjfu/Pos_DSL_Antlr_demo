// Generated from PriceStrategy.g4 by ANTLR 4.5
package bjfu.em.se.pos.domain.salepricing.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PriceStrategyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PriceStrategyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PriceStrategyParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(PriceStrategyParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(PriceStrategyParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStat(PriceStrategyParser.NormalStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStat}
	 * labeled alternative in {@link PriceStrategyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStat(PriceStrategyParser.EmptyStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareNotBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareNotBoolExpr(PriceStrategyParser.CompareNotBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBoolExpr(PriceStrategyParser.OrBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBoolExpr(PriceStrategyParser.CompareBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentheseBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheseBoolExpr(PriceStrategyParser.ParentheseBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndBoolExpr}
	 * labeled alternative in {@link PriceStrategyParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBoolExpr(PriceStrategyParser.AndBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(PriceStrategyParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(PriceStrategyParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentheseExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheseExpr(PriceStrategyParser.ParentheseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(PriceStrategyParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link PriceStrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(PriceStrategyParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscountStrategy(PriceStrategyParser.DiscountStrategyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusStrategy(PriceStrategyParser.MinusStrategyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsoluteMinusStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteMinusStrategy(PriceStrategyParser.AbsoluteMinusStrategyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoDiscountStrategy}
	 * labeled alternative in {@link PriceStrategyParser#strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoDiscountStrategy(PriceStrategyParser.NoDiscountStrategyContext ctx);
}