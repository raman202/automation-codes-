package baseCode1;

public class rentPayment {

	public static void main(String[] args) {
	    // Create a rent calculator program,
		
double basicRent = 1500;
double utility = 45.50;
double parking = 25.44;
double waterBill = 49.68;

double totalRent;

int roommates = 4;

totalRent = basicRent + utility + parking + waterBill;
 double rentshare = totalRent/roommates;
 
String NM = "RamanPaul2020";

System.out.println(totalRent);
System.out.println(rentshare);
System.out.println(NM);

		
	}

}
