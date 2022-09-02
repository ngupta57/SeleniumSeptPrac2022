package Day1;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		// TAKING INT, DOUBLE AND STRING FROM USER
		
		Scanner sc =new Scanner(System.in);
		System.out.println(" Please enter an Int: ");
		int x=sc.nextInt();
		System.out.println("you typed: " + x);
		
		Scanner sc2 =new Scanner(System.in);
		System.out.println(" Please enter an double: ");
		double y=sc2.nextDouble();
		System.out.println("you typed: " + y);
		Scanner sc3 =new Scanner(System.in);
		System.out.println(" Please enter an String: ");
		String m=sc3.next();
		System.out.println("you typed: " + m);
		
		

	}

}
