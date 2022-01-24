package day2;

public class ForLoop {
	public static void main(String[] args) {
		for(int row=1;row<=3;row++) {
			for(int co=1;co<row;co++) {
				System.out.print(" ");
			}
			for(int col=3;col>=row;col--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row1=1;row1<=3;row1++) {
			for(int col2=2;col2>=row1;col2--) {
				System.out.print(" ");
			}
			for(int col3=1;col3<=row1;col3++) {
				System.out.print("!");
			}
			System.out.println();
		}
		
		for(int row2=1;row2<=3;row2++) {
			for(int col3=1;col3<=row2;col3++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int row3=1;row3<=3;row3++) {
			for(int col4=3;col4>=row3;col4--) {
				System.out.print("$");
				
			}
			System.out.println();
		}
		
		for(int row4=1;row4<=3;row4++) {
			for(int space=2;space>=row4;space--) {
				System.out.print(" ");
			}
			for(int no1=1;no1<=row4;no1++) {
				System.out.print(no1);
			}
			for(int no2=1;no2<row4;no2++) {
				System.out.print(no2);
			}
			System.out.println();
		}

	}

}
