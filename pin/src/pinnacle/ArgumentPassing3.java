package pinnacle;

public class ArgumentPassing3 {
	public static void main(String[] args) {
		ArgumentPassing3 obj=new ArgumentPassing3();
		Animal animal=new  obj.getMyAnimal();
		
		animal.hunt();
		
		
	}
	
	public Animal getMyAnimal() {
		return new Animal();
		
	}

}

class Animal{
	public void hunt() {
		System.out.println("animal hunting.....");
	}
}