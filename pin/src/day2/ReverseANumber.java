package day2;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Input your Number and Press Enter");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num!=0) {
			reversenum*=10;
			reversenum+=num%10;
			num/=10;
		}
		System.out.println("Reverse of number: "+reversenum);
	}

}
