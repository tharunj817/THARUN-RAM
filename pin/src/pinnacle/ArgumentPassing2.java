package pinnacle;

public class ArgumentPassing2 {
	public static void main(String[] args) {
		int a[] =  {10,20,30,40,50}; 
		ArgumentPassing2 obj=new ArgumentPassing2();
		
		System.out.println("Array value before passing..."+a[3]);
		obj.acceptArray(a);
		//arrays are by default pass by reference even though its a primitive type
	System.out.println("Array value after passing...."+a[3]);
	}
	void acceptArray(int arr[]) {
		arr[1]=987;
		
	}

}
