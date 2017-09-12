package main.java.designpatterns.observer;

import java.util.ArrayList;
import java.util.Observable;

public class ObservableDemo extends Observable
	{
	private ArrayList<ObserverExample> observers = new ArrayList<>();
	private String weather;

		public ObservableDemo(String weather)
	    {
				this.weather = weather;
	    }

		public String getWeather()
	    {
		    return weather;
	    }

		public void setWeather(String weather)
	    {
		    this.weather = weather;
		    setChanged();
		    notifyObservers();
	    }
	}

