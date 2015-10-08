package eu.ooti.forumlite;

import java.io.IOException;
import java.util.List;

public class MoviePlayer 
{
	MovieReader reader;
	List<String> MovieContents;
	
	public MoviePlayer()
	{
		reader = new MovieReader();
	}
	
	
	public void PlayMovie(String filename) throws IOException
	{
		MovieContents = reader.ReadMovie(filename);
		//more here soon
	}
	

}
