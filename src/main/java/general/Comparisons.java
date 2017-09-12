package main.java.general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//Driver class
class Comparisons {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		/* Old style
		 Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));*/
		
		//New Style 1
		/*Collections.sort(ar, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.rollno - o2.rollno;
			}
			
		});*/
		
		//New style 2
//		Collections.sort(ar, (Student s1, Student s2) ->s1.getRollno().compare(s2.getRollno));
//		System.out.println("Sorted");
//		ar.forEach(s -> System.out.println(s.toString()));
		
		//New style 3
		//ar.sort((a,b)->Integer.valueOf(a.getRollno()).compareTo(Integer.valueOf(b.getRollno())));
		//System.out.println("Sorted");
		//ar.forEach(s -> System.out.println(s.toString()));
		Comparator<Student> comp = Collections.reverseOrder((Student s1, Student s2) ->s1.getName().compareTo(s2.getName()));
		Collections.sort(ar, comp);
		System.out.println("Sorted");
		ar.forEach(s -> System.out.println(s.toString()));
	}
}
