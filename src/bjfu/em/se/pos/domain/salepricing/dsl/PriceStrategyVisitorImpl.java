package bjfu.em.se.pos.domain.salepricing.dsl;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by Roy on 2015/2/3.
 */
public class PriceStrategyVisitorImpl extends  PriceStrategyBaseVisitor<Object> implements  PriceStrategyVisitor<Object> {

    @Override
    public Object visitScript(@NotNull PriceStrategyParser.ScriptContext ctx) {

        return super.visitScript(ctx);
    }

    @Override
    public Object visitIfStat(@NotNull PriceStrategyParser.IfStatContext ctx) {
        return super.visitIfStat(ctx);
    }

    @Override
    public Object visitNormalStat(@NotNull PriceStrategyParser.NormalStatContext ctx) {
        return super.visitNormalStat(ctx);
    }

    @Override
    public Object visitEmptyStat(@NotNull PriceStrategyParser.EmptyStatContext ctx) {
        return super.visitEmptyStat(ctx);
    }

    @Override
    public Object visitCompareNotBoolExpr(@NotNull PriceStrategyParser.CompareNotBoolExprContext ctx) {
        return super.visitCompareNotBoolExpr(ctx);
    }

    @Override
    public Object visitOrBoolExpr(@NotNull PriceStrategyParser.OrBoolExprContext ctx) {
        return super.visitOrBoolExpr(ctx);
    }

    @Override
    public Object visitCompareBoolExpr(@NotNull PriceStrategyParser.CompareBoolExprContext ctx) {
        return super.visitCompareBoolExpr(ctx);
    }

    @Override
    public Object visitParentheseBoolExpr(@NotNull PriceStrategyParser.ParentheseBoolExprContext ctx) {
        return super.visitParentheseBoolExpr(ctx);
    }

    @Override
    public Object visitAndBoolExpr(@NotNull PriceStrategyParser.AndBoolExprContext ctx) {
        return super.visitAndBoolExpr(ctx);
    }

    @Override
    public Object visitMulExpr(@NotNull PriceStrategyParser.MulExprContext ctx) {
        return super.visitMulExpr(ctx);
    }

    @Override
    public Object visitNumExpr(@NotNull PriceStrategyParser.NumExprContext ctx) {
        return super.visitNumExpr(ctx);
    }

    @Override
    public Object visitParentheseExpr(@NotNull PriceStrategyParser.ParentheseExprContext ctx) {
        return super.visitParentheseExpr(ctx);
    }

    @Override
    public Object visitVarExpr(@NotNull PriceStrategyParser.VarExprContext ctx) {
        return super.visitVarExpr(ctx);
    }

    @Override
    public Object visitAddExpr(@NotNull PriceStrategyParser.AddExprContext ctx) {
        return super.visitAddExpr(ctx);
    }

    @Override
    public Object visitDiscountStrategy(@NotNull PriceStrategyParser.DiscountStrategyContext ctx) {
        return super.visitDiscountStrategy(ctx);
    }

    @Override
    public Object visitMinusStrategy(@NotNull PriceStrategyParser.MinusStrategyContext ctx) {
        return super.visitMinusStrategy(ctx);
    }
}
