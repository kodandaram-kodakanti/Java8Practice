package io.corejava.designPatterns.strategy;

public class ContextClass {
	private StrategyInterface strategy;

	public ContextClass(StrategyInterface strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(int a, int b) {
		System.out.println(strategy.doOperation(a, b));
	}
}