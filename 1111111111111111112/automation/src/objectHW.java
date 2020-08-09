package functions;

public class objectHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		functioncode1 obj1 = new functioncode1();
		
		System.out.println( "The value of x");
		
		
		int AA = obj1.add3Numbers(22, 111, 232);
		
		System.out.println(AA);
		
		int A = obj1.add3Numbers(10, 20, 30);
		System.out.println(A);	
	
		obj1.printData("Hello");
		
		boolean ce = obj1.checkEquality(20, 20); 
		
		obj1.printName();
		
		obj1.printboolean(100>101);
	
		int hm =obj1.add3Numbers(1, 22, 123456);
		System.out.println(hm);	

	}


	
	
	
	
	
	
}
