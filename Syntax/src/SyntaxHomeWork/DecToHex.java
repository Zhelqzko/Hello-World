package SyntaxHomeWork;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Input = in.nextInt();
		String hex = Integer.toHexString(Input);
		System.out.println(hex);
		
		

	}

}
