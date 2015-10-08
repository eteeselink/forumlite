package eu.ooti.forumlite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.googlecode.lanterna.terminal.Terminal.Color;

public class MoviePlayer implements AutoCloseable
{
	MovieReader reader;
	List<String> MovieContents;
	StringShower strsh;
	List<String> alarmSequence;
	
	public MoviePlayer()
	{
		reader = new MovieReader();
		strsh= new StringShower();
		alarmSequence=new ArrayList<String>();
		alarmSequence.add("    A");
		alarmSequence.add("   A ");
		alarmSequence.add("  A  ");
		alarmSequence.add(" A   ");
		alarmSequence.add("A    ");
	}
	
	
	public void PlayMovie(String filename) throws IOException, InterruptedException
	{
		MovieContents = reader.ReadMovie(filename);
		//more here soon
		for(String item : MovieContents)
		{
			String[] params = item.split(",");
			if(params[1]!="")
			{
				switch(params[1])
				{
					case "R":
						strsh.setColor(Color.RED);
						break;
					case "G":
						strsh.setColor(Color.GREEN);
						break;
					case "B":
						strsh.setColor(Color.BLUE);
						break;
					default:
						strsh.setColor(Color.WHITE);
						break;
				}
			}
			strsh.PushStringToDisplay(params[0]);
			Thread.sleep(1000); //playing movie with the ultimate speed of 2 frames per second
		}
	}
	
	public void PlayAlarm() throws InterruptedException
	{
		while(true)
		{
			strsh.setColor(Color.RED);
			for(String item: alarmSequence)
			{
				strsh.PushStringToDisplay(item);
				Thread.sleep(1000); //playing movie with the ultimate speed of 2 frames per second
			}
		}
	}


	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
