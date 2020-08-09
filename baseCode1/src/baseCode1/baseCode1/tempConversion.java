package baseCode1;

public class tempConversion {

	public static void main(String[] args) {
		// Celsius_temparature = (farenhite_temperature - 32)*5)/9;

		double Farenhite =70;
		double Celsius = ((Farenhite-32)*5)/9;
		String name = "RamanPaul";
		
		System.out.println(Celsius);
		System.out.println(name);
		 
		boolean hot = Celsius>20;
	
		if(hot) { 
			
			System.out.println(" It HOT!!");
		}
				
	}

}
