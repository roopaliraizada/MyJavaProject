package main.java.java8.predicateexample;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class AnotherPredicateExample {
	
	public static IntPredicate isGreater(int n){
		return p -> p > n;
	}
	public static IntPredicate isLesser(int n){
		return p -> p < n;
	}

	public static void main(String[] args) {
		int i = 8;
		int j = 20;
		int[] intArray = {4,16,19,30,72,16,11,3,7};
				
		// WIthout predicate
		System.out.println(Arrays.toString(Arrays.stream(intArray).filter(p -> p>i).toArray()));
		
		// Using Predicate
		System.out.println(Arrays.toString(Arrays.stream(intArray).filter((IntPredicate) isGreater(i)).toArray()));

		// Using Predicate- and
		System.out.println(Arrays.toString(Arrays.stream(intArray).filter((IntPredicate) isGreater(i).and((IntPredicate) isLesser(j))).toArray()));

		// Using Predicate- or
		System.out.println(Arrays.toString(Arrays.stream(intArray).filter((IntPredicate) isGreater(j).or((IntPredicate) isLesser(i))).toArray()));

		// Using Predicate- negate
		System.out.println(Arrays.toString(Arrays.stream(intArray).filter((IntPredicate) isGreater(i).negate()).toArray()));

		//Testing predicate on an arg - test
		System.out.println(isGreater(10).test(5));
		
		// Using BiPredicate
		BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
	    System.out.println(bi.test(4, 3));
	    
	    Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
	    //c.accept("JAVA");
	    c.andThen(c).accept("JAVA AGAIN");
	    

	}

}
