package pinnacle;

public class ClassesAndMethod {
	public static void main(String[] args) {
		int i=10;//simple type
		//complex type
		Integer ii=10;//this concept of allocating a simple number to an object is called boxing
		Integer in=ii;//boxing
		int n=i;//allocating a complex type to a simple type is called unboxing
		Integer iii=new Integer(10);//this got deprecated in jdk7
		Integer iiii=Integer.valueOf(10);//this is latest
		//We always go with simple types, because that occupies less memory and it works faster
		//we use Integer type only when we are forced to pass complex type
				
		//The other complex types are Float, Character, Short, Long, Byte, Boolean - these are also referred as wrapper classes
				
		//u can also define classes and create variables of that type
				
		
		Motor crompton;
		
		crompton=new Motor();
		crompton.rotate();
		System.out.println("Speed of Motor before setting: "+crompton.getSpeed());
		
		crompton.setSpeed(2000);		
		System.out.println("Speed Of Motor After setting:... "+crompton.getSpeed());
		
		crompton.setDetails(4000,"THIS IS CROMPTON MOTOR:...");
		System.out.println("The Motor Details:...."+crompton.getDetailsOfMotor());
		
		Human Tharun=new Human();
		Tharun.cry();
		
		
	}

}

class Motor{
	int speed=1000;
	private String name;
	void rotate() {
		System.out.println("Rotate Method called....");
	}
		int getSpeed() {
			return speed;
		}
		
		void setSpeed(int s) {
			speed=s;
			
		}
		
		void setDetails(int s,String name) {
			speed=s;
			this.name=name;
		}
		
		String getDetailsOfMotor() {
			return "Details...."+"::"+this.speed;
		}
	
}

class Human{
	void cry(){
		System.out.println("Human crying.....");
	}
}
