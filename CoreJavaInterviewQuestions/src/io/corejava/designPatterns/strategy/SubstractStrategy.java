package io.corejava.designPatterns.strategy;

public class SubstractStrategy implements StrategyInterface {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}

}
