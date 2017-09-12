package main.java.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverExample implements Observer
{
	String name;
	ObserverExample(String name){
		this.name = name;
		System.out.println("My name is " + name);
	}
	
	String getName(){
		return this.name;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	private ObservableDemo weatherUpdate ;

	@Override
    public void update(Observable observable, Object arg)
    {
			weatherUpdate = (ObservableDemo) observable;
			System.out.println(this.name + ":");
			System.out.println("Weather Report Live. Its "+weatherUpdate.getWeather());
    }

	public static void main(String[] args)
    {
		    ObservableDemo observable = new ObservableDemo(null);
		    ObserverExample observer1 = new ObserverExample("Observer 1");
		    ObserverExample observer2 = new ObserverExample("Observer 2");
		    observable.addObserver(observer1);
		    observable.addObserver(observer2);
		    
		    observable.setWeather("Bright and sunny...Let's play cricket!! ");
		    observable.setWeather("Raining Heavily!..Let's have hot Pakodas!!");
    }
}
