package eu.ooti.forumlite;

public class Displayer {
	
	
		public static void display (int a[][])
		{
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(a[i][j] == 1)	
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
	}
	}

		public static void main(String args[])
		{
//			int a[][] = {
//					{1,0,0,1,1},
//					{1,1,1,1,1},
//					{0,0,0,0,0},
//					{1,1,1,1,1},
//					{1,1,1,1,1},
//						};
//		display(a);
		}
}
