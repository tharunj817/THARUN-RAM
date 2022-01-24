package day2;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lenght of the triangle: ");
		double lenght=scanner.nextDouble();
		System.out.println("Enter the width of the triangle: ");
		double width=scanner.nextDouble();
		double area=lenght*width;
		System.out.println("Area of Rectangle: "+area);
	}

}
