package baseCode1;

public class Carpayment1 {

	public static void main(String[] args) {

	double carprice = 20000;
	double downpayment = 2000;
	double adminfee = 550;
	double warranty = 1500;
	
	double taxRate = 5;
	double apr = 2;
	int numberofinstallments = 60;
	
	double finalcarprice = 60;
	
		
		finalcarprice = (carprice-downpayment) + adminfee + warranty;
		
		System.out.println(finalcarprice);
		
		
		// TODO Auto-generated method stub

	}

}
