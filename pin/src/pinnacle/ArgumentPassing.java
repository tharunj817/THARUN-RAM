package pinnacle;

public class ArgumentPassing {
	public static void main(String[] args) {
		Laddu lad=new  Laddu();
		PBV pbv=new PBV();
		System.out.println("Size of Laddu:  "+lad.size);
		pbv.accept(lad.size);
		System.out.println("Size of laddu after passing:  "+lad.size);
		PBR pbr=new PBR();
	
		System.out.println("Size of Laddu before passing :  "+lad.size);
		pbr.accept(lad);
		System.out.println("Size of Laddu after passing: "+lad.size);
		
		
		
	}

}

class Laddu{
	int size=10;
}

class PBV{
	public void accept(int size){
		size=5;
	}
}

class PBR{
	public void accept(Laddu lad) {
		lad.size=6;
	}
}