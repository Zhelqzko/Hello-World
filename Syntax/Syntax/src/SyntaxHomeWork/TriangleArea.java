package SyntaxHomeWork;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	
	float Ax = in.nextFloat();
	float Ay = in.nextFloat();
	float Bx = in.nextFloat();
	float By = in.nextFloat();
	float Cx = in.nextFloat();
	float Cy = in.nextFloat();
	float area = Math.abs(((Ax*(By-Cy))+(Bx*(Cy-Ay))+(Cx*(Ay-Cy)))/2);
	System.out.println((int)area);
	}

}
