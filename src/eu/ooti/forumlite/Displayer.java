package eu.ooti.forumlite;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class Displayer implements AutoCloseable {
	private static Screen screen;
	
	//public LightSimulator() {
	//	screen = TerminalFacade.createScreen();
	//	screen.startScreen();
	//}

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
	

	
	
	
		public static void display (int a[][])
		{
			
			int[][] displayMatrix = new int[5][43];

			
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<4;j++)
				{
					displayMatrix[i][j] = 0;
				}
				for(int j=4;j<9;j++)
				{
					displayMatrix[i][j] = a[i][j-4];
				}
				for(int j=9;j<14;j++)
				{
					displayMatrix[i][j] = 0;
				}
				for(int j=14;j<19;j++)
				{
					displayMatrix[i][j] = a[i][j-9];
				}
				for(int j=19;j<22;j++)
				{
					displayMatrix[i][j] = 0;
				}
				for(int j=22;j<27;j++)
				{
					displayMatrix[i][j] = a[i][j-13];
				}
				for(int j=27;j<38;j++)
				{
					displayMatrix[i][j] = 0;
				}
				for(int j=38;j<43;j++)
				{
					displayMatrix[i][j] = a[i][j-18];
				}
			}
			
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<43;j++)
				{
					if(a[i][j] == 1)	
						screen.putString(20+j, 10+i, "*", Color.RED, Color.BLACK, ScreenCharacterStyle.Blinking);
					else
						screen.putString(20+j, 10+i, " ", Color.RED, Color.BLACK, ScreenCharacterStyle.Blinking);
				}
				
			}
			
			
			screen.refresh();
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				
			}
		
			
			screen.clear();
			screen.refresh();
	}

}
