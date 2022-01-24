package pinnacle;

public class IfElseIfElse {
	public static void main(String[] args) {
		//? - ternary operator
		boolean b=10>20;
		System.out.println(b?"is lesser than 20":"is not lesser than 20");
		
		int n=11;
		b=(n%2==0);//the mod of n%2, if it is equal to 0 then it will return true
		String result=b?"Even Number...":"Odd Numbr...";
		System.out.println(n+"is a..."+result);
		
		//IF-ELSE-IF LADDER
		
		if(b) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		int age =60;
		
		if(age<=10) {
			System.out.println("You are Child..");
			
		}
		else if(age<=20) {
			System.out.println("You are teen..");
		}
			
		else if(age<=30) {
			System.out.println("You are youth..");
		}
		else if(age<=40) {
			System.out.println("You are semi old..");
		}
		else if(age<=50) {
			System.out.println("You are old..");
		}
		else {
			System.out.println("You are Very old..");
		}
		
		String month ="February";
		int day=11;
		if(month.equals("January")) {
			if (day<=10) {
				System.out.println("Holidays..");
			}
			else if(day>10) {
				System.out.println("New World.. ");
			}
		}
		else if(month.equals("February")) {
			System.out.println("My Dreams Come True..");
		}
		
	}

}
