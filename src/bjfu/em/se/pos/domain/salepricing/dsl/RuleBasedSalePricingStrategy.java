/**
 * 使用自定义DSL计算打折金额
 * DSL格式：
 * 每行一条规则，格式为"如果A那么B"
 * A为逻辑表达式，B为折扣计算方式
 * 按照DSL中第一条A为真的规则B计算折扣
 */
package bjfu.em.se.pos.domain.salepricing.dsl;

import java.io.StringReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import bjfu.em.se.pos.domain.Sale;
import bjfu.em.se.pos.domain.salepricing.ISalePricingStrategy;

public class RuleBasedSalePricingStrategy implements ISalePricingStrategy {
	private final ParseTree tree;
	private final String name;
	private final String description;
	
	public RuleBasedSalePricingStrategy(String script, String name, String description) {
		this.name=name;
		this.description=description;
		//解析DSL脚本并保存AST
		ANTLRInputStream stream=new ANTLRInputStream(script);
		PriceStrategyLexer lexer=new PriceStrategyLexer(stream);
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		PriceStrategyParser parser=new PriceStrategyParser(tokens);
		tree=parser.script();
	}

	@Override
	public int calculate(Sale s) {
		//使用Visitor模式，遍历语法树从而执行脚本
		PriceStrategySaleVisitor visitor=new PriceStrategySaleVisitor(s) ;
		return (Integer)visitor.visit(tree);
	}


	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
