package main.java.designpatterns.decorator;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza tempPizza = null;
	
	public PizzaDecorator(Pizza newPizza) {
		this.tempPizza = newPizza;
	}
	
	public String getDescription(){
		return tempPizza.getDescription();
	}
	
	public double getCost(){
		return tempPizza.getCost();
	}
	
}
