package SyntaxHomeWork;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		float b = in.nextFloat();
		float c = in.nextFloat();
		String hex = Integer.toHexString(a);
		String bin = Integer.toBinaryString(a);
		System.out.printf("|"+hex+"|"+bin+"|%10.2f|%-10.3f|",b,c);
		

	}

}
