package day2;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		int rows, number=1,counter,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows for Floyd Triangle: ");
		rows=input.nextInt();
		System.out.println("Floyd Triangle");
		System.out.println("****************");
		for(counter = 1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.println(number+"");
				number++;
			}
			System.out.println();
			
		}
	}

}
