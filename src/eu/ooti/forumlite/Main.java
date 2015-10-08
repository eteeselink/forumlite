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
			if (arguments != null) {
				if (arguments.getFilename() != null) {
					MoviePlayer moviePlayer = new MoviePlayer();
					moviePlayer.PlayMovie(arguments.getFilename());
				}
				if (arguments.getWord() != null) {
					StringShower stringShower = new StringShower();
					stringShower.PushCharToDisplay(arguments.getWord().charAt(0));
				}
			}
		} catch (InvalidCommandLineException clException) {
			System.out.println("Invalid commandline exception " + clException.getMessage());
		} catch (InvalidOptionConfigurationException configException) {
			System.out.println("Invalid commandline exception " + configException.getMessage());
		} catch (UnrecognizedSwitchException unrecognizedSwitchException) {
			System.out.println("Invalid commandline exception " + unrecognizedSwitchException.getMessage());
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
