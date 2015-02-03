package bjfu.em.se.pos.domain.salepricing.dsl;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import bjfu.em.se.pos.domain.Sale;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.AbsoluteMinusStrategyContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.AddExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.AndBoolExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.CompareBoolExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.CompareNotBoolExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.DiscountStrategyContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.EmptyStatContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.IfStatContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.MinusStrategyContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.MulExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.NoDiscountStrategyContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.NormalStatContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.NumExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.OrBoolExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.ParentheseBoolExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.ParentheseExprContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.ScriptContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.StatContext;
import bjfu.em.se.pos.domain.salepricing.dsl.PriceStrategyParser.VarExprContext;

/**
 * 
 * @author Roy
 * 注意：
 *   算术表达式的运算结果类型为Double（因为可能会涉及0.8之类的小数
 *   在计算逻辑表达式时，会将算术结果进行取整，以避免由于舍入误差导致的判断失败
 */
public class PriceStrategySaleVisitor extends PriceStrategyBaseVisitor<Object> 
	implements PriceStrategyVisitor<Object>{
	private final Sale sale;
	private final int preDiscountTotal;
	

	public PriceStrategySaleVisitor(Sale sale) {
		this.sale = sale;
		this.preDiscountTotal=sale.getPreDiscountTotal();
	}

	@Override
	public Object visitScript(ScriptContext ctx) {
		int price=sale.getPreDiscountTotal();
		for(StatContext stat: ctx.stat()) {
			Pair<Boolean,Integer> ret=(Pair<Boolean, Integer>) visit(stat);
			if (ret.a) {
				price=ret.b;
				break;
			}
		}
		return price;
	}

	@Override
	public Object visitIfStat(IfStatContext ctx) {
		boolean criteria=(Boolean)visit(ctx.boolexpr());
		if (criteria) {
			return new Pair<Boolean,Integer>(true,(Integer)visit(ctx.strategy()));
		}
		return new Pair<Boolean,Integer>(false,0);
	}

	@Override
	public Object visitNormalStat(NormalStatContext ctx) {
		return new Pair<Boolean,Integer>(true,(Integer)visit(ctx.strategy()));
	}

	@Override
	public Object visitEmptyStat(EmptyStatContext ctx) {
		return new Pair<Boolean,Integer>(false,0);
	}

	@Override
	public Object visitCompareNotBoolExpr(CompareNotBoolExprContext ctx) {
		double left=(Double)visit(ctx.expr(0));
		double right=(Double)visit(ctx.expr(1));
		return ! compare(left,right,ctx.op);
	}

	@Override
	public Object visitOrBoolExpr(OrBoolExprContext ctx) {
		return (Boolean)visit(ctx.boolexpr(0)) || (Boolean)visit(ctx.boolexpr(1));
	}

	@Override
	public Object visitCompareBoolExpr(CompareBoolExprContext ctx) {
		double left=(double)visit(ctx.expr(0));
		double right=(double)visit(ctx.expr(1));
		return compare(left,right,ctx.op);
	}

	private boolean compare(double left, double right, Token comparator) {
		long leftValue=Math.round(left);
		long rightValue=Math.round(right); 
		System.out.println(leftValue+"vs"+rightValue+comparator);
		switch (comparator.getType()) {
			case PriceStrategyParser.LT:
				return left<right;
			case PriceStrategyParser.GT:
				return left>right;
			case PriceStrategyParser.EQ:
				return left==right;
			case PriceStrategyParser.LTE:
				return left<=right;
			case PriceStrategyParser.GTE:
				return left>=right;
		}
		throw new RuntimeException("unknow comparator!"+comparator);
	}

	@Override
	public Object visitParentheseBoolExpr(ParentheseBoolExprContext ctx) {
		return visit(ctx.boolexpr());
	}

	@Override
	public Object visitAndBoolExpr(AndBoolExprContext ctx) {
		return (Boolean)visit(ctx.boolexpr(0)) && (Boolean)visit(ctx.boolexpr(1));
	}

	@Override
	public Object visitMulExpr(MulExprContext ctx) {
		double left=(double)visit(ctx.expr(0));
		double right=(double)visit(ctx.expr(1));
		switch (ctx.op.getType()) {
			case PriceStrategyParser.MUL:
				return left*right;
			case PriceStrategyParser.DIV:
				return left/right;
		}
		throw new RuntimeException("unknow op!"+ctx.op);
	}

	@Override
	public Object visitNumExpr(NumExprContext ctx) {
		return Double.parseDouble(ctx.getText())*100;
	}

	@Override
	public Object visitParentheseExpr(ParentheseExprContext ctx) {
		return visit(ctx.expr());
	}

	@Override
	public Object visitVarExpr(VarExprContext ctx) {
		switch (ctx.getText()) {
		case "折前金额":
		case "折前总额":
			return (double)preDiscountTotal;
		}
		throw new RuntimeException("wrong var name:"+ctx.getText());
	}

	@Override
	public Object visitAddExpr(AddExprContext ctx) {
		double left=(double)visit(ctx.expr(0));
		double right=(double)visit(ctx.expr(1));
		switch (ctx.op.getType()) {
			case PriceStrategyParser.ADD:
				return left+right;
			case PriceStrategyParser.SUB:
				return left-right;
		}
		throw new RuntimeException("unknow op!"+ctx.op);
	}

	@Override
	public Object visitDiscountStrategy(DiscountStrategyContext ctx) {
		int discount=Integer.parseInt(ctx.INT().getText());
		if (discount<0 || discount>100) {
			throw new RuntimeException("wrong discount!"+ctx.INT().getText());
		}
		if (discount<10) {
			discount*=10;
		}
		System.out.println("discount"+discount);
		return preDiscountTotal*discount/100;
	}

	@Override
	public Object visitMinusStrategy(MinusStrategyContext ctx) {
		int thresh=Integer.parseInt(ctx.threshold.getText())*100;
		int value=Integer.parseInt(ctx.value.getText())*100;
		System.out.println("minus"+thresh+" "+value);
		return preDiscountTotal-(preDiscountTotal/thresh)*value;
	}

	@Override
	public Object visitAbsoluteMinusStrategy(AbsoluteMinusStrategyContext ctx) {
		int thresh=Integer.parseInt(ctx.threshold.getText())*100;
		int value=Integer.parseInt(ctx.value.getText())*100;
		System.out.println("minus2"+thresh+" "+value);
		if (preDiscountTotal>=thresh) {
			return preDiscountTotal-value;
		}
		return preDiscountTotal;
	}

	@Override
	public Object visitNoDiscountStrategy(NoDiscountStrategyContext ctx) {
		return preDiscountTotal;
	}
	
	
	

}
