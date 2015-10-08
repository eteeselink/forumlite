package eu.ooti.forumlite;

import java.security.InvalidParameterException;

public class StringShower {
	
	/**
	 * The link to the display
	 */
	private static Displayer display;

	public StringShower() {
		this.display = new Displayer();
	}
	
	/**
	 * Constructor that is used when the display is already known.
	 * This can be used for automated testing. 
	 *  
	 * @param disp The display
	 */
	public StringShower(Displayer disp) {
		this.display = disp;
	}
	
	/**
	 * Displays string with maximum 5 characters on the display
	 * 
	 * @param s String that needs to be displayed
	 * @post String is displayed
	 * @throws InvalidParameterException when parameter s does not contain five characters
	 */	
	public void PushStringToDisplay(String s) throws InvalidParameterException {
		int[][] matrixString = MakeMatrixFromString(s);
		
		display.displayString(matrixString);
	}
	
	/**
	 * Creates the matrix that represents the string
	 * 
	 * @param s The string
	 * @return The array with the lights configuration
	 * @throws InvalidParamterFunction when the size of the string is not five
	 */
	public int[][] MakeMatrixFromString(String s) throws InvalidParameterException {
		if (s.length() != 5) {
			throw new InvalidParameterException("String should contain five characters");
		}
		
		int matrixString [][] = new int [5][25];
		
		for (int c = 0; c < s.length(); c++) {
			int charMatrix[][] = ConvertChar(s.charAt(c));
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					matrixString[i][c * 5 + j] = charMatrix[i][j];
				}
			}
		}
		return matrixString;
	}
	
	/**
	 * Displays a single character on the display
	 * 
	 * @param c The character that needs to be displayed
	 * @post The character is displayed
	 */
	public void PushCharToDisplay(char c) {
		int[][] lights = this.ConvertChar(c);
		
		display.display(lights);
	}


	/**
	 * Converts the character into the corresponding light
	 * 
	 * @param c The character that needs to be converted
	 * @return A 5 by 5 matrix that indicates whether a light should be on (1) or off (0).
	 * Note that when the character is invalid all lights are off. 
	 */
	public int[][] ConvertChar(char c) {
		int[][] matrix;

		switch (c){
		case 'O' :
			matrix = new int[][] 
					{{1, 0, 1, 0, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 1, 0, 1}};
				break;
		case 'o' :
			matrix = new int[][] 
					{{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 0},
				{0, 1, 0, 1, 0},
				{0, 1, 1, 1, 0},
				{0, 0, 0, 0, 0}};
				break;
		case '.' :
			matrix = new int[][] 
					{{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}};
				break;
		case '\\' :
			matrix = new int[][] 
					{{1, 0, 0, 0, 0},
				{0, 1, 0, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 1}};
				break;
		case '/' :
			matrix = new int[][] 
					{{0, 0, 0, 0, 1},
				{0, 0, 0, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 1, 0, 0, 0},
				{1, 0, 0, 0, 0}};
				break;
		case '|' :
			matrix = new int[][] 
					{{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 1, 0, 0}};
				break;
		case '-' :
			matrix = new int[][] 
					{{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{1, 1, 1, 1, 1},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}};
				break;
		case 'a' :
			matrix = new int[][] 
					{{0, 0, 1, 0, 0},
				{0, 1, 0, 0, 0},
				{1, 1, 1, 1, 1},
				{0, 1, 0, 0, 0},
				{0, 0, 1, 0, 0}};
				break;
		default :
			matrix = new int[][] 
					{{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}};
		};

		return matrix;

	}
}
