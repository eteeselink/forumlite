package eu.ooti.forumlite;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal.Color;


public class Displayer implements AutoCloseable {
	private final Screen screen;

	public Displayer() {
		screen = TerminalFacade.createScreen();
		screen.startScreen();
	}

	public void close() throws Exception {
		screen.stopScreen();
	}

	public Screen getScreen() {
		return screen;
	}





	/* public void displaySomething(Color foreground) throws InterruptedException {
		screen.putString(20, 10, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 11, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 12, "    * * * * *     * * * * *    * * * * *     * * * * *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 13, "      * * *         * * *        * * *         * * *  ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.putString(20, 14, "    *   *   *     *   *   *    *   *   *     *   *   *", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
		screen.refresh();
		Thread.sleep(2000);

		screen.clear();
		screen.refresh();
	}
	 */

	public void displaySomething(int a[][], Color foreground) throws InterruptedException {

		int i,j;
		String ch;
		for( i=0;i<5;i++)
		{
			for(j=0;j<25;j++)
			{
				if(a[i][j] == 1)	
					ch = "#";
				else
					ch = " ";

				// screen.putString(20+2*j,10+(i), ch, Color.GREEN, Color.BLACK, ScreenCharacterStyle.Blinking);
				screen.putString(20+j,10+(i), ch, foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
			}                         

			screen.refresh();
			//Thread.sleep(2000);

			//screen.clear();
			screen.refresh();


		}
	}
}

