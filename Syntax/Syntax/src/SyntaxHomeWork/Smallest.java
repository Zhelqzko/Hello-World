package SyntaxHomeWork;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float a = in.nextFloat();
	float b = in.nextFloat();
	float c = in.nextFloat();
	if (a<=b && a<=c) {
		System.out.println((int)a);
		
	} else if (b<= a && b<=c) {
		System.out.println((int)b);
		
	} else if (c<=a&&c<=b) {
		System.out.println((int)c);
	}{

	}

	}

}
