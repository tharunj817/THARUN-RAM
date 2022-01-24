package day2;

public class DisplayPrimeNumber {
	public static void main(String[] args) {
		int i=0;
		int num=0;
		String PrimeNumber="";
		for(i=0;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter+=1;
				}
			}
			if(counter==2) {
				PrimeNumber+=i+"";
			}
		}
		System.out.println("Prime Numbers from 1 to 100: ");
		System.out.println(PrimeNumber);
	}

}
