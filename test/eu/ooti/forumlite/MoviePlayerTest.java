package eu.ooti.forumlite;

import static org.junit.Assert.*;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MoviePlayerTest {

	@Test
	public void testMoviePlayer() throws Exception 
	{
		try(MoviePlayer mp = new MoviePlayer()) 
		{System.out.println("hello");}
	}

	@Test
	public void testPlayMovie() throws Exception {
		try(MoviePlayer mp = new MoviePlayer())
		{
			mp.PlayMovie("movie.txt");
			System.out.println("hello");
		}
	}

}
