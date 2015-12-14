package cli;

import org.apache.commons.cli.ParseException;

public class App {

	public static void main(String[] args) throws ParseException {
		Parser parser = new Parser();
		Input input = parser.parse(args);
		System.out.println(input);
	}
}
