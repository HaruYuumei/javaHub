package tools;

public class MeasureConverter {

	///
	///
	///		"No one is born into this World to be alone..."
	///
	///
	
	//inches to centimeters
	//miles to kilometers
	
	//ounces to grams
	//pound to kilograms
	 
	//liters to gallons
	
	
	//inches to centimeters:
	public void inchestoCentimeters(double inch) {
		double result = 0;
		result = inch * 2.54;
		System.out.printf("%.2f inches in Centimeters is: %.2f cm \n",inch,result);
		
	}
	
	public void milestokilometers(double moraes) {
		double result = 0;
		result = moraes * 1.60;
		System.out.printf("%.2f miles in Kilometers is: %.2f KM \n",moraes,result);
	}
	
	public void ouncestoGrams(double grammy) {
		double result = 0;
		result = grammy * 28.34;
		System.out.printf("%.2f Ounces in Grams is: %.2f Grams \n",grammy,result);
	}
	
	public void poundtoKg(double pound) {
		double result = 0;
		result = pound * 0.45;
		System.out.printf("%.2f Pounds in Kilograms is: %.2f Kg \n",pound,result);
	}
	
	public void literstoGallons(double gura) {
		double result = 0;
		result = gura * 0.26;
		System.out.printf("%.2f Liters in Gallons is: %.2f \n",gura,result);
	}
}
