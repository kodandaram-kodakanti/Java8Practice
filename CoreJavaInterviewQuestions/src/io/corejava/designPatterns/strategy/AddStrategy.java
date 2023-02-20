package io.corejava.designPatterns.strategy;

public class AddStrategy implements StrategyInterface {

	@Override
	public int doOperation(int a, int b) {
		return a + b;
	}

}
