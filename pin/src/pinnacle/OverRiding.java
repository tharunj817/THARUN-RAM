package pinnacle;

public class OverRiding {
	public static void main(String[] args) {
		Super superObj=new Sub();
		superObj.met();
		
		
	}

}
//INHERITANCE
//INHERITANCE IS A KIND OF RELATIONSHIP, WHERE THE CHILD CAN REPLACE THE PARENT
class Super{//PARENT CLASS
	void met() {
		System.out.println("Super class called......");
	}
}

class Sub extends Super{//CHILD CLASS
	void met() {
		System.out.println("Sub class met called.....");
	}
}













