package cli;

import org.apache.commons.cli.*;

public class Parser {

	private Options options;

	public Parser() {
		options = new Options();
		options.addOption(Option.builder("f")
				.longOpt("first_option")
				.desc("first option bla-bla")
				.required()
				.hasArg()
				.type(PatternOptionBuilder.NUMBER_VALUE)
				.build());
		options.addOption(Option.builder("s")
				.longOpt("second_option")
				.desc("second option bla-bla")
				.hasArg()
				.type(String.class)
				.build());

	}

	public Input parse(String[] args) throws ParseException {
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		return new Input((Long) cmd.getParsedOptionValue("f"),
				cmd.getOptionValue("s", "default"));
	}
}



















//HelpFormatter formatter = new HelpFormatter();
//formatter.printHelp( "ant", options );
