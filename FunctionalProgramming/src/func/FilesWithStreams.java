package func;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilesWithStreams {
	public static void main(String[] args) throws IOException {
		
		Stream<String> lines = Files.lines(Paths.get("filetest.txt"));
		
		lines.map(str -> str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);
		

	}
}
