package eu.ooti.forumlite;

import com.github.jankroken.commandline.CommandLineParser;
import com.github.jankroken.commandline.OptionStyle;
import com.github.jankroken.commandline.domain.InvalidCommandLineException;
import com.github.jankroken.commandline.domain.InvalidOptionConfigurationException;
import com.github.jankroken.commandline.domain.UnrecognizedSwitchException;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class Main {

	/**
	 * For parsing parameters you can pass
	 * program arguments like this
	 * -f hello.txt -w OOOO
	 * or like this
	 * -file hello.txt -word OOOO
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		try {
			Arguments arguments = CommandLineParser.parse(Arguments.class, args, OptionStyle.SIMPLE);
			// TODO: use received arguments
		} catch (InvalidCommandLineException clException) {
			// TODO: implement error handling
		} catch (InvalidOptionConfigurationException configException) {
			// TODO: implement error handling
		} catch (UnrecognizedSwitchException unrecognizedSwitchException) {
			// TODO: implement error handling
		}
		try(LightSimulator sim = new LightSimulator()) {
			sim.displaySomething(Color.RED);
			Thread.sleep(200);
			sim.displaySomething(Color.GREEN);
			Thread.sleep(200);
			sim.displaySomething(Color.YELLOW);
		}
	}

}
