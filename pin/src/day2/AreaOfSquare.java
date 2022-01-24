package day2;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter the side of a square: ");
		Scanner scanner=new Scanner(System.in);
		double side=scanner.nextDouble();
		double area=side*side;
		System.out.println("Area of square: "+area);
	}

}
