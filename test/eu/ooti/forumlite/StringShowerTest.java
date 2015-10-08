package eu.ooti.forumlite;

import static org.junit.Assert.*;
import java.security.InvalidParameterException;

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

	/*@Test
	public void TestPushChar() throws Exception {
		StringShower ss = new StringShower();

		ss.PushCharToDisplay('O');
		ss.PushCharToDisplay('O');

		ss.PushCharToDisplay('o');

		ss.PushCharToDisplay('.');

		ss.PushCharToDisplay('\\');

		ss.PushCharToDisplay('/');

		ss.PushCharToDisplay('|');

		ss.PushCharToDisplay('-');

		ss.PushCharToDisplay('1');		
	}*/

	@Test
	public void TestPushString() throws Exception {
		StringShower ss = new StringShower();
		
		try {
			int[][] matrix = ss.MakeMatrixFromString("Oo.oO");
			assertEquals(matrix.length, 5);
			assertEquals(matrix[0].length, 25);
			assertEquals(matrix[0][0], 1);
			assertEquals(matrix[4][24], 1);
			
			matrix = ss.MakeMatrixFromString("-----");
			assertEquals(matrix.length, 5);
			assertEquals(matrix[0].length, 25);
			assertEquals(matrix[0][0], 0);
			assertEquals(matrix[4][24], 0);
			
			matrix = ss.MakeMatrixFromString("1---O");
			assertEquals(matrix.length, 5);
			assertEquals(matrix[0].length, 25);
			assertEquals(matrix[0][0], 0);
			assertEquals(matrix[4][24], 1);
		}
		catch (InvalidParameterException ex) {
			assertEquals(false, true);
		}
		
		try {
			ss.PushStringToDisplay("Oo..oO");
		}
		catch (InvalidParameterException ex) {
			assertEquals(true, true);
		}
		
		try {
			ss.PushStringToDisplay("OooO");
		}
		catch (InvalidParameterException ex) {
			assertEquals(true, true);
		}
	}
	
}
