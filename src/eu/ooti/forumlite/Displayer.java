package eu.ooti.forumlite;

<<<<<<< HEAD
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
=======
public class Displayer {


	public static void display (int a[][])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i][j] == 1)		
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
>>>>>>> 17df66b6dcf9f970386f2a231fe2563aa244d910
	}
	

<<<<<<< HEAD
	
	
	
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
        
        
        
        
        public void displaySomething(Color foreground) throws InterruptedException {
		
            int i,j;
            int a[][] = {
					{1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0},
                                        {1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
                                        {1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
                                        {1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1},
                                        {1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1}
					
						};
            
            
            
            String ch;
            for( i=0;i<5;i++)
			{
			for(j=0;j<25;j++)
			{
                            if(a[i][j] == 1)	
						ch = "#";
					else
						ch = " ";
                            
                            screen.putString(20+2*j,10+(i), ch, foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
                            
                            
                    
                        
                        
                        }
                        
                        screen.putString(20+j,10+(i), " ", foreground, Color.BLACK, ScreenCharacterStyle.Blinking);
                         
            
                       screen.refresh();
                        Thread.sleep(2000);
		
                	//screen.clear();
                        screen.refresh();
                    
             
	}
        }
}
=======
	public static void displayString (int a[][])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<25;j++)
			{
				if(a[i][j] == 1)		
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}

	}

	public static void main(String args[])
	{
		int a[][] = {
				{1,0,0,1,1},
				{1,1,1,1,1},
				{0,0,0,0,0},
				{1,1,1,1,1},
				{1,1,1,1,1},
		};
		display(a);
	}
}
>>>>>>> 17df66b6dcf9f970386f2a231fe2563aa244d910
