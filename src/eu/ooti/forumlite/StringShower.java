package eu.ooti.forumlite;

public class StringShower {




	private int[][] ConvertChar(char c) {
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
