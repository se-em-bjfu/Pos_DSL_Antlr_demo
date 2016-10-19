package bjfu.em.se.pos.domain.salepricing;

import bjfu.em.se.pos.domain.salepricing.dsl.RuleBasedSalePricingStrategy;

/**
 * 打折策略工厂类
 * 
 * @author Roy
 *
 */
public final class PricingStrategyFactory {
	private static PricingStrategyFactory instance=new PricingStrategyFactory();
	
	private String name="无折扣";
	private String description="无折扣";
	private String script="";
	
	/**
	 * 创建的定价策略实例
	 * 在本demo中，每次创建一个新的JavascriptDSLPricingStrategy实例
	 * @return
	 */
	public ISalePricingStrategy createPricingStrategy() {
		return new RuleBasedSalePricingStrategy(
				script,
				name,
				description);
		
	}
	
	private PricingStrategyFactory(){
	}
	
	public static PricingStrategyFactory getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}
	
	

}
