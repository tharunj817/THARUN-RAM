package day2;

public class NestedIf {
	public static void main(String[] args) {
		int a=8,b=19,c=9;
		if(a>b) {
			if(a>c) {
				System.out.println("A is bigger.....");
			}
			else if(c>a) {
				System.out.println("C is bigger....");
			}
			else {
				System.out.println("A and C are same....");
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("B is bigger...");
			}
			else if(c>b) {
				System.out.println("C is bigger...");
			}
			else {
				System.out.println("B and C is bigger...");
			}
		}
		else if(b>c) {
			System.out.println("A and B is bigger...");
		}
		else if(c>a) {
			System.out.println("C is bigger...");
		}
		else {
			System.out.println("A ,B,C are same... ");
		}
	}

}
