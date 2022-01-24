package pinnacle;

public class SwitchCase {
public static void main(String[] args) {
	int month=2;
	switch(month){
	case 1:{
		System.out.println("January...");
		break;
	}
	case 2:{
		System.out.println("February...");
		break;
	}
	default:{
		System.out.println("Don't Know the Month...");
	}
	}
	char c='a';
	
	switch(c) {
	case 'a':{
		System.out.println("Apple...");
		break;
	}
	case 'b':{
		System.out.println("Ball...");
		break;
	}
	default:{
		System.out.println("Don't Know the Aphabet...");
	}
	}
	
	String str="January";
	switch(str){
	case "January":{
		System.out.println("1st Month...");
		break;
	}
	case "February":{
		System.out.println("2nd Month...");
		break;
	}
	default:{
		System.out.println("Don't the Month...");
	}
	}
	
}
}
