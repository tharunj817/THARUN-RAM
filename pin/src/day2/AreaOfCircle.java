package day2;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("Area of Circle:  "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("Circumference of Circle: "+circumference);
	}

}
