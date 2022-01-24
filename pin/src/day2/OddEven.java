package day2;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number: ");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if (num % 2 == 0 )
			System.out.println("It is even");
		else
			System.out.println("It is odd");			
			
	}

}
