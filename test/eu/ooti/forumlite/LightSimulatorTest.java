package eu.ooti.forumlite;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.TerminalSize;

public class LightSimulatorTest {

	@Test
	public void test() throws Exception {
		try(LightSimulator sim = new LightSimulator()) {
			Screen screen = sim.getScreen();
			TerminalSize size = screen.getTerminalSize();
			assertThat(size.getColumns()).isGreaterThan(10);
			assertThat(size.getRows()).isGreaterThan(10);
			System.out.println("hi");
		}
	}

}
