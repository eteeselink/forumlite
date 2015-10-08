package eu.ooti.forumlite;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringShowerTest {

	@Test
	public void testConvertChar() throws Exception {
		StringShower ss = new StringShower();
		assertArrayEquals(ss.ConvertChar('1'), new int [][]
			{{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}});
		
		assertArrayEquals(ss.ConvertChar('O'), new int [][]
			{{1, 0, 1, 0, 1},
			{0, 0, 0, 0, 0},
			{1, 0, 0, 0, 1},
			{0, 0, 0, 0, 0},
			{1, 0, 1, 0, 1}});
		
		assertArrayEquals(ss.ConvertChar('o'), new int [][]
			{{0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0},
			{0, 1, 0, 1, 0},
			{0, 1, 1, 1, 0},
			{0, 0, 0, 0, 0}});
		
		assertArrayEquals(ss.ConvertChar('.'), new int [][]
			{{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}});
		
		assertArrayEquals(ss.ConvertChar('\\'), new int [][]
			{{1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1}});
		
		assertArrayEquals(ss.ConvertChar('|'), new int [][]
			{{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 1, 0, 0}});
		
		assertArrayEquals(ss.ConvertChar('-'), new int [][]
			{{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{1, 1, 1, 1, 1},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}});
	}
	
	@Test
	public void TestPushChar() throws Exception {
		StringShower ss = new StringShower();
		
		ss.PushCharToDisplay('O');
	}
}
