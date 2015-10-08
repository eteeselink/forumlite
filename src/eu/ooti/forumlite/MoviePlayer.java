package eu.ooti.forumlite;

import java.io.IOException;
import java.util.List;

public class MoviePlayer implements AutoCloseable
{
	MovieReader reader;
	List<String> MovieContents;
	StringShower strsh;
	
	public MoviePlayer()
	{
		reader = new MovieReader();
		strsh= new StringShower();
	}
	
	
	public void PlayMovie(String filename) throws IOException, InterruptedException
	{
		MovieContents = reader.ReadMovie(filename);
		//more here soon
		for(String item : MovieContents)
		{
			strsh.PushStringToDisplay(item);
			Thread.sleep(500); //playing movie with the ultimate speed of 2 frames per second
		}
	}


	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
