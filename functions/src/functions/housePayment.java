package functions;

import Pageobjects.functioncode1;

public class housePayment {

	private static final int Hometax = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		functioncode1 loanTerm = new functioncode1();

		
			double HomePrice = 459500;
			
				System.out.println("Base Home Price");

			double MoneyDown = 95000;
			
				System.out.println("Down Payment");


			double Apr = 4.75;
			
				System.out.println("Intrest Rate");

			double Hometax = 7;
			
				System.out.println("Home Tax");

			
			double closingcost = 2500;
			
				System.out.println("Closing Cost");


			int creditScore; 
				creditScore=601;
		
			if(creditScore<600){ System.out.println("Loan is not approved");} 
		
			int financingTime = 60;
			
		
			int loantermyears = loanTerm.numberofyears(20);
		
				System.out.println("Credit Score");

				
				System.out.println(loantermyears);
		
			double FinalHomeCost;
				FinalHomeCost = (HomePrice- MoneyDown) + closingcost;
			System.out.println(FinalHomeCost);
			
			double HomepriceWithInterest;
				HomepriceWithInterest = FinalHomeCost + FinalHomeCost*(Apr/100);
			System.out.println(HomepriceWithInterest);
			
			System.out.println("HomepriceWithTax");

			double HomepriceWithTax;
				HomepriceWithTax = HomepriceWithInterest + HomepriceWithInterest*(Hometax/100);
			System.out.println(HomepriceWithTax);
			
			System.out.println("MonthlyCarBill");

			double MonthlyHomeBill;
				MonthlyHomeBill = HomepriceWithTax/loantermyears;
			System.out.println(MonthlyHomeBill);
			
			String name = "RamanPaul";
			System.out.println(name);
				if(FinalHomeCost>MoneyDown) {
			System.out.println(" WOW ");	}
	}


}