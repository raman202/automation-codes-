package Pageobjects;

public class functioncode1 {
	// Function-1 will take 3 integer number as inputs
	// and return the summation of the 3 numbers function name: add3Numbers
	// Function -2 will take 1 string as input and print the value of the string,
	// it will not return anything function name: printData
	// Function-3 will take 2 numbers as input and returns a Boolean value
	// true if the two numbers are equal otherwise will return false function name: checkEquality
	// Function-5 will take a Boolean value as input and print the value in the console, 
	// will not return anything, function name: printboolean

	public int add3Numbers (int x, int y, int z) {
		int sum = x+y+z;
		return sum;}
	
	public void printData(String a) {}
		
	public boolean checkEquality( int x, int y) {
		boolean z = x==y;
		boolean z1 = false;
		if (x==y) {System.out.println(z);}
		else { System.out.println(z1);}
		return z;}
	
	public void printName (){System.out.println("Raman Paul");}
	
	public void printboolean(boolean a1){ System.out.println(a1);}
	
	public int numberofyears( int years ) { 
       int totalmonths = 12*years;
       
       return totalmonths;}

}
