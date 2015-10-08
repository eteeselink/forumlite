package eu.ooti.forumlite;

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
	
	public void PushStringToDisplay(String s){
		//String has length of 5, no new line characters
		
		int matrixString [][] = new int [5][25];
		
//		matrixString[0] = addAll(PushCharToDisplay(s.charAt(i));
		
		for (int c = 0; c < s.length(); c++) {
			int charMatrix[][] = ConvertChar(s.charAt(c));
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					matrixString[i][c*5+j] = charMatrix[i][j];
				}
			}
		}		
		display.display(matrixString);
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
