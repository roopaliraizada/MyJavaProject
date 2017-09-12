package main.java.java8.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class RunnableDemo {
	public static void main(String[] args) {
	final ExecutorService exService = Executors.newFixedThreadPool(2);
        Runnable r = () -> System.out.println("Lambda Expression Test with Runnable");
        exService.submit(r);
     }
}