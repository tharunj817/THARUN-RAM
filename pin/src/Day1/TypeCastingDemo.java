package Day1;

public class TypeCastingDemo {
public static void main(String[] args) {
	byte num1=10;
	int num=num1;//compatible
	
	//byte num2=num;//incompatible - 32 bit cannot fit in 8 bit
	
	byte num2=10;
	
	//byte value=num1*num2;//when you use arithmetic operations on numbers - they undergo auto type promotion to int - so incompatible
	
	int value=num1*num2;
	
	int i=257;
	//byte ii=i;//even though the value is lesser than 127, still it is of type int - so incompatible
	
	//how to work with incompatible types
	
	//type casting
	byte ii=(byte)i;//this is called type casting
	System.out.println(ii);
	
	char c=97;
	char cccc='a';
	//char c=-100;//invalid data...
	System.out.println(c);//it will always print the character representation
	int cc=c;//auto casting - compatible
	System.out.println(cc);
	System.out.println((char)cc);
	char ch=(char)cc;//incompatible - you cannot, so you have to cast
	
	

}
}

