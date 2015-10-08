package eu.ooti.forumlite;

import com.github.jankroken.commandline.CommandLineParser;
import com.github.jankroken.commandline.OptionStyle;
import com.github.jankroken.commandline.domain.InvalidCommandLineException;
import com.github.jankroken.commandline.domain.InvalidOptionConfigurationException;
import com.github.jankroken.commandline.domain.UnrecognizedSwitchException;
import com.googlecode.lanterna.terminal.Terminal.Color;

import javax.swing.*;

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
				if (arguments.isAlarm()) {
					MoviePlayer moviePlayer = new MoviePlayer();
					moviePlayer.PlayAlarm();
				}
				if (arguments.getWord() != null) {
					StringShower stringShower = new StringShower();
					stringShower.PushStringToDisplay(arguments.getWord());
				}
			}
		} catch (InvalidCommandLineException clException) {
			showErrorDialog("Invalid commandline exception " + clException.getMessage());
		} catch (InvalidOptionConfigurationException configException) {
			showErrorDialog("Invalid option configuration exception " + configException.getMessage());
		} catch (UnrecognizedSwitchException unrecognizedSwitchException) {
			showErrorDialog("Unrecoznized swith exception " + unrecognizedSwitchException.getMessage());
		}
		try(Displayer sim = new Displayer()) {
			/*sim.displaySomething(Color.RED);
			Thread.sleep(200);
			sim.displaySomething(Color.GREEN);
			Thread.sleep(200);
			sim.displaySomething(Color.YELLOW);*/
		}
	}

	private static void showErrorDialog(String message) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
	}

}
