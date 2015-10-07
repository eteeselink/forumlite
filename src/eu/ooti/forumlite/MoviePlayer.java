package eu.ooti.forumlite;

import java.util.List;

public class MoviePlayer 
{
	MovieReader reader;
	List MovieContents;
	
	public MoviePlayer()
	{
		reader = new MovieReader();
	}
	
	
	public void PlayMovie(String filename)
	{
		MovieContents = reader.ReadMovie(filename);
		//more here soon
	}
	

}
