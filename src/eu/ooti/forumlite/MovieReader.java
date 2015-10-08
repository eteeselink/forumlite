package eu.ooti.forumlite;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MovieReader implements AutoCloseable
{
	private List<String> movie;
	
	public MovieReader()
	{
		movie = new ArrayList<String>();
	}
	
	public List<String> ReadMovie(String filename) throws IOException
	{
		//reading file here
		BufferedReader br = new BufferedReader(new FileReader(filename));
		try {
		    String line = br.readLine();

		    while (line != null && line != "") {
		        movie.add(line);
		        line = br.readLine();
		        
		    };
		} finally {
		    br.close();
		}
		return movie;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
