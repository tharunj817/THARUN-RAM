package day2;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[10];
		int sum=0;
		System.out.println("Enter the elements: ");
		for(int i=0;i<10;i++) {
			array[i]=scanner.nextInt();
		}
		for(int num:array) {
			sum+=num;
		}
		System.out.println("Sum of array Elements is: "+sum);
	}

}
