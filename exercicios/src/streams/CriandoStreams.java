package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS");

		langs.forEach(print);
		System.out.println();

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go" };
		Stream.of(maisLangs).forEach(print);
		System.out.println();

		Arrays.stream(maisLangs).forEach(print);
		System.out.println();

		Arrays.stream(maisLangs, 1, 3).forEach(print);
		System.out.println();

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin");
		outrasLangs.stream().forEach(print);
		System.out.println();

		outrasLangs.forEach(print);
		System.out.println();

		// String infinita
		// Stream.generate(() -> "a").forEach(print);;
		// Stream.iterate(0, n -> n + 1).forEach(println);;
	}
}
