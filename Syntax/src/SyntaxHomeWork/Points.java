package SyntaxHomeWork;

import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x = in.nextFloat();
		float y = in.nextFloat();
		if ((y>=6 && y<=8.5 && x>=12.5 && x<=22.5) 
		   || (y>=8.5 && y<=13.5 && x>=12.5 && x<=17.5)
		   ||(y>=8.5 && y<=13.5 && x>=20 && x<=22.5)) {
			System.out.println("Inside");
			
		} else {
			System.out.println("Outside");

		}

	}

}
