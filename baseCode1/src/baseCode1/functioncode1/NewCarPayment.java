package functioncode1;


	public class NewCarPayment {

	public static void main(String[] args) {
		// Create the car price calculator by calculating monthly payment for the car
		// the problem is to find car monthly payment
		
			System.out.println("2020 Maserati Levante Trofeo");
			
			functioncode1 loanTerm = new functioncode1();

		double Carprice = 149000;
		double MoneyDown = 65000;
		double Apr = 3;
		double CarTax = 7;
		double Adminfees = 1500;
		
		int financingTime = loanTerm.
		
		System.out.println("Loan Term");
		
		
		double FinalCarCost;
		FinalCarCost = (Carprice- MoneyDown) + Adminfees;
			System.out.println(FinalCarCost);
			
		double CarpriceWithInterest;
		CarpriceWithInterest = FinalCarCost + FinalCarCost*(Apr/100);
			System.out.println(CarpriceWithInterest);
			
		double CarpriceWithTax;
		CarpriceWithTax = CarpriceWithInterest + CarpriceWithInterest*(CarTax/100);
			System.out.println(CarpriceWithTax);
			
		double MonthlyCarBill;
			MonthlyCarBill = CarpriceWithTax/financingTime;
			System.out.println(MonthlyCarBill);
			
		String name = "RamanPaul";
			System.out.println(name);
		if(FinalCarCost>expensiceCar) {
			System.out.println(" The is very Expensive car");	}
				
	}

}
