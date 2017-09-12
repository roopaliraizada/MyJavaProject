package main.java.java8.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreams {
	public static void main(String[] args) {
		// 1. Stream of integer values
		Stream<Integer> intStream = Stream.of(3, 6, 1, 8, 2, 9, 4, 5, 7);
		intStream.forEach(i -> System.out.print(i));
		// intStream.forEachOrdered(i -> System.out.print(i));

		// 2. Stream of array
		Stream<String> strStream = Stream.of(new String[] { "Cat", "Dog",
				"Pig", "Horse", "Mouse" });
		strStream.forEach(p -> System.out.println("Here's a " + p));

		// 3. Stream of list Collections
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		Stream<Integer> listStream = al.stream();
		listStream.forEach(p -> System.out.print(p));

		// 4. Using Stream.generate()
		Stream<Date> dtStream = Stream.generate(() -> new Date()).limit(5);
		dtStream.forEach(p -> System.out.println(p));

		// 5. Using Stream.iterate()
		Stream<Integer> itStream = Stream.iterate(20, n -> n + 2).limit(10);
		itStream.forEach(p -> System.out.println(p));

		// 6. Using Stream.builder
		Stream<String> streamBuilder = Stream.<String> builder().add("a")
				.add("b").add("c").build();
		streamBuilder.forEach(p -> System.out.println(p));

		Stream<Integer> intStreamBuilder = Stream.<Integer> builder().add(23)
				.add(12).add(21).build();
		intStreamBuilder.forEach(p -> System.out.println(p));

		// 7. Stream of Strings
		// Since there is no interface CharStream in JDK, the IntStream is used
		// to represent a stream of chars instead.
		IntStream charStream = "abc".chars();
		charStream.forEach(p -> System.out.print(p));

		// 8. Stream of Strings using Regex
		Stream<String> regStream = Pattern.compile(", ").splitAsStream(
				"Cat, Dog, Cow");
		regStream.forEach(p -> System.out.println(p));

		Stream<String> regStream2 = Stream.of("A$B$C".split("\\$"));
		regStream2.forEach(p -> System.out.println(p));

		// Stream of file
		//
		Path path = Paths.get("C:\\file.txt");
		try {
			Stream<String> streamOfStrings = Files.lines(path);
			Stream<String> streamWithCharset = Files.lines(path,
					Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
