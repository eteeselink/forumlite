package eu.ooti.forumlite;

import com.googlecode.lanterna.terminal.Terminal.Color;

public class Main {

	public static void main(String[] args) throws Exception {
		try(LightSimulator sim = new LightSimulator()) {
			sim.displaySomething(Color.RED);
			Thread.sleep(200);
			sim.displaySomething(Color.GREEN);
			Thread.sleep(200);
			sim.displaySomething(Color.YELLOW);
		}
	}

}
