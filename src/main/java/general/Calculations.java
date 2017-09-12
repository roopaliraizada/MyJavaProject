package main.java.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculations {

	static int result = 1;

	public static void main(String[] args) {
		Calculations calc = new Calculations();
		//System.out.println(calc.factorial(5));
		//calc.fibonacci(7);
		calc.factorial8(5);
		//calc.findDuplicate(new Integer[]{1,2,3,4,5,6,7,8,9,9,10});
		//calc.distinctTest(new Integer[]{11,2,1,1,5,1,1,1} );
	}

	private int factorial(int n) {
		if (n == 1)
			return result;
		result = n * factorial(n - 1);		
		System.out.println("result::::" + result);

		return result;
	}

	private void fibonacci(int n) {
		Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] })
	      .limit(n).forEach(p->System.out.println(p[0]));
	}
	
	private void factorial8(int n){
		//System.out.println(IntStream.rangeClosed(1, n).sum());
		System.out.println(IntStream.rangeClosed(2, n).reduce(1, (x, y) -> x * y));
	}
	
	private void findDuplicate(Integer[] arr){
		int sumArr = Arrays.stream(arr).mapToInt(Integer :: intValue).sum();
		int sumNum = IntStream.rangeClosed(1, arr.length-1).sum();
		System.out.println(sumArr +"-"+ sumNum + "::: " + (sumArr - sumNum));
	}
	
	private void distinctTest(Integer[] arr){
		List<Integer> list = Arrays.asList(arr);
        Stream<Integer> l = list.stream().distinct();
        Arrays.stream(arr).mapToInt(Integer :: intValue).sorted().forEach(p -> System.out.println(p));
	}
	
	private void sorting(Integer[] arr) {
		//Arrays.stream(arr).forEach((arr[0],arr[1]) -> System.out.println();
		//Stream.(new Integer[]{ arr[0], arr[1] }, p->new Integer[]{ p[0], p[1] })
	    //  .limit(n).forEach(p->System.out.println(p[0]));
		Collections.sort(Arrays.asList(arr));
		Arrays.stream(arr).mapToInt(Integer :: intValue).sorted().forEach(p -> System.out.println(p));
		
	}

}
