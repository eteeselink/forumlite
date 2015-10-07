package eu.ooti.forumlite;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MovieReader 
{
	List movie;
	
	public MovieReader()
	{
		movie = new ArrayList();
	}
	public List ReadMovie(String filename) throws IOException
	{
		//reading file here
		BufferedReader br = new BufferedReader(new FileReader(filename));
		try {
		    String line = br.readLine();

		    while (line != null) {
		        movie.add(line);
		        line = br.readLine();
		    };
		} finally {
		    br.close();
		}
		return movie;
	}

}
