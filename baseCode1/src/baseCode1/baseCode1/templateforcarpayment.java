package baseCode1;

public class templateforcarpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double carprice = 25000; 
		double downpayment = 2000; 
		
		double adminfee = 750; 
		double warrenty = 1500; 
		
		double TaxRate = 7; 
		
		double apr = 4; 
		
		int numberofInstallment = 72; 
		
		
		double finalcarprice; 
		double carpriceWithInterest;
		double carpricewithTax; 
		
		finalcarprice = (carprice-downpayment) + adminfee + warrenty; 
		System.out.println("Final car price");
		System.out.println(finalcarprice);
		
		carpriceWithInterest = finalcarprice + finalcarprice*(apr/100);
		System.out.println("car price with interest");
		System.out.println(carpriceWithInterest);
		
		carpricewithTax = carpriceWithInterest+carpriceWithInterest*(TaxRate/100);
		
		System.out.println("car price with tax");
		System.out.println(carpricewithTax);
		
		double monthlyPayment; 
		
		
		monthlyPayment=carpricewithTax/numberofInstallment;
		
		System.out.println("monthly installment of the car");
		System.out.println(monthlyPayment);
		

		
		
		
	}

}
