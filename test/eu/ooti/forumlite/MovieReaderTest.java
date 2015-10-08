package eu.ooti.forumlite;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Test;

public class MovieReaderTest 
{

	@Test
	public void testMovieReader() throws Exception 
	{
		try(MovieReader mr = new MovieReader()) 
		{System.out.println("hello");}
	}

	@Test
	public void testReadMovie() throws Exception 
	{
		List<String> contents;
		try(MovieReader mr = new MovieReader())
		{
			assertThat(mr.ReadMovie("movie.txt").size()).isEqualTo(6);
			System.out.println("hello");
		}
	}

}
