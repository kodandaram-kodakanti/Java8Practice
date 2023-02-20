package io.corejava.designPatterns.strategy;

public class StrategyTest {

	public static void main(String[] args) {

		ContextClass addContext = new ContextClass(new AddStrategy());
		System.out.print("Add ExecuteStrategy: ");
		addContext.executeStrategy(15, 5);
		System.out.println();
		ContextClass substractContext = new ContextClass(new SubstractStrategy());

		System.out.print("Substract ExecuteStrategy: ");
		substractContext.executeStrategy(15, 5);
		System.out.println();
		ContextClass multiplyContext = new ContextClass(new MultiplyStrategy());
		System.out.print("Multiply ExecuteStrategy: ");
		multiplyContext.executeStrategy(15, 5);
	}

}
