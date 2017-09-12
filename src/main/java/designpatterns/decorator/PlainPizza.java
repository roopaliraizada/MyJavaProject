package main.java.designpatterns.decorator;

public class PlainPizza implements Pizza{

	@Override
	public String getDescription() {
		return "Adding dough";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
