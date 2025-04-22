package yuumeisHub;

import java.util.Scanner;

import tools.Calculator;
import tools.CoinConverter;
import tools.MeasureConverter;

///
/// Edgerunners: Girl on fire ep6 - 17:30s
///
///
/// "Hey Lucy... Aren't you gonna tell me...
///	"That you believe in me too?..." 



public class Main {
	
	public static void main(String[] args) {
		
		boolean linkStarto = true;
		Scanner input = new Scanner(System.in);
		Calculator makima = new Calculator();
		CoinConverter nami = new CoinConverter();
		MeasureConverter kitagawaMarin = new MeasureConverter();
		
		while(linkStarto) {
			
			System.out.println("Okaerinasai, goshujin-sama~ ♥ Welcome to Yuumei's Hub!");
			System.out.println("Please Select a menu:");
			System.out.println("1.Tools, 2.Fun, 3.Learning, 4.Experimental, 0.Exit");
			
			try
			{
				int goshujinChoice = input.nextInt();
				if(goshujinChoice <0 || goshujinChoice > 4)
				{
					throw new RuntimeException("Invalid Choice Goshujin-sama, Please try again.");
				}
				
				
				switch(goshujinChoice) {
				
					//Close Application
					case 0:
						linkStarto = false;
						input.close();
						break;
						
					//Tools menu, access to all tools projects
					case 1:
						
						System.out.println("Welcome to the Tools menu, goshujin-sama~, Which one shall I ready for you first?");
						System.out.println("0.Go Back, 1.Simple Calculator, 2.Coin Converter. 3.Measurements");
						try {
							int goshujinSecondChoice = input.nextInt();	
							
							switch(goshujinSecondChoice)
							{
								//exit
								case 0:
									break;
									
								// Calculator
								case 1:
									
									System.out.println("Please, type the first number Goshujin-Sama");
									
									try {
										
										double goshujinNumber = input.nextDouble();
										makima.addValue(goshujinNumber);
									}
									catch(Exception e)
									{
										System.out.println(e.getMessage());
									}
									
									System.out.println("Please, type the Next number Goshujin-Sama");
									try {
										double goshujinNumber = input.nextDouble();
										makima.addValue(goshujinNumber);
									}
									catch(Exception e)
									{
										System.out.println(e.getMessage());
									}
									
									boolean addTrue = true;
									while(addTrue)
									{
										System.out.println("Would you like to add more numbers to the operations Goshujin-Sama?");
										
										System.out.println("1.Yes, 2.No");
									
										try{
											int goshujinMoreNumbers = input.nextInt();
											
											switch(goshujinMoreNumbers)
											{
												case 1:
													try {
														double goshujinNumber = input.nextDouble();
														makima.addValue(goshujinNumber);
													}
													catch(Exception e)
													{
														System.out.println(e.getMessage());
													}
													break;
												case 2:
													addTrue = false;
													break;
											}
										}
										catch (Exception e)
										{
											System.out.println(e.getMessage());
										}
									}
									
								
									
									System.out.println("What operation would Goshujin-Sama do?");
									System.out.println("1.Add, 2.Subtraction, 3.Division, 4.Multiply");
									
									try {
										
										int goshujinOperation = input.nextInt();
										
										switch(goshujinOperation)
										{
											case 1:
												makima.add();
												break;
											case 2:
												makima.minus();
												break;
											case 3:
												makima.divide();
												break;
											case 4:
												makima.multiply();

												break;
											
										}
										
									}
									catch(Exception e) {
										System.out.println(e.getMessage());
									}
									
									
									break;
									
								/// Coin Converter R$ to dolar,euro or Yen
								case 2:
								{
									System.out.println("Welcome, Goshujin-sama. Please, may I assist you in choosing the currency you wish to convert?");
									System.out.println("Simply select the desired one, and I shall handle the rest with care and precision.");
									System.out.println("Goshujin-sama, the conversion will always be from Brazilian Real to your chosen currency.");
									
									System.out.println("1.Euro, 2.Dolar, 3.Yen");
									
									try {
										int goshujinConverter = input.nextInt();
										if(goshujinConverter <= 0 || goshujinConverter >3)
										{
											throw new RuntimeException("Goshujin-sama, invalid option, please try again.");
										}
											
										switch(goshujinConverter) {
											//Euro
											case 1:
												System.out.println("Goshujin-sama, please insert the value in Euro:");
												double euro = input.nextDouble();
												nami.euroConverter(euro);
												break;
												
											//Dolar
											case 2:
												System.out.println("Goshujin-sama, please insert the value in Dolar:");
												double dolar = input.nextDouble();
												nami.dolarConverter(dolar);
												break;
												
											//Yen
											case 3:
												System.out.println("Goshujin-sama, please insert the value in Yen:");
												double yen = input.nextDouble();
												nami.yenConverter(yen);
												break;
										}
										
										
									}
									catch(Exception e) {
										System.out.println(e.getMessage());
									}
									
									
									break;
								}
								/// Measurement converter
								case 3:
								{
									
									System.out.println("Welcome, Goshujin-sama. Might I now guide you to the realm of measurements?");
									System.out.println("With a gentle touch, I shall assist you in converting units with utmost grace and accuracy.");
									System.out.println("Simply select the measurement type, and leave the rest to your ever-loyal maid.");
									
									System.out.println("1.Inches to Cm, 2.Miles to KM, 3.Ounces to grams, 4.Pounds to Kilograms, 5.Liters to Gallons");
									try {
										int goshujinMeasures = input.nextInt();
										if(goshujinMeasures <= 0 || goshujinMeasures >5)
										{
											throw new RuntimeException("Goshujin-sama, invalid option, please try again.");
										}
										
										switch(goshujinMeasures) {
										
										//inches to Cms
										case 1:
											System.out.println("Goshujin-sama, please type in the Value in Inches:");
											double inches = input.nextDouble();
											kitagawaMarin.inchestoCentimeters(inches);
											break;
										//MIles to KM
										case 2:
											System.out.println("Goshujin-sama, please type in the Value in miles:");
											double miles = input.nextDouble();
											kitagawaMarin.milestokilometers(miles);
											break;
										//Ounces to grams
										case 3:
											System.out.println("Goshujin-sama, please type in the Value in Ounces:");
											double ounce = input.nextDouble();
											kitagawaMarin.ouncestoGrams(ounce);
											break;
										//Pounds to Kilograms
										case 4:
											System.out.println("Goshujin-sama, please type in the Value in Pound:");
											double pounds = input.nextDouble();
											kitagawaMarin.poundtoKg(pounds);
											break;
										//Liters to Gallons
										case 5:
											System.out.println("Goshujin-sama, please type in the Value in Liters:");
											double liter = input.nextDouble();
											kitagawaMarin.literstoGallons(liter);
											break;
										
										}

									}
									catch(Exception e) {
										System.out.println(e.getMessage());
									}
									
										
									
									break;
								}
								case 4:
								{
									break;
								}
							}
							
							
						}
						catch(Exception e){
							System.out.println(e.getMessage());
						}
						
						
						break;
						
					//Fun Menu, Access to all Fun related projects
					case 2:
						break;
						
					//Learning Menu, Access to learning projects, uni works, etc
					case 3:
						break;
						
					//Experimental Menu, Access to experimental coding, integrations
					case 4:
						break;
				
				}
				
				
				
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
				
					
			
			
			
		}
		
		
		
	}

}
