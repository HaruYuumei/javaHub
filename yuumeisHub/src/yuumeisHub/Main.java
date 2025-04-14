package yuumeisHub;

import java.util.*;
import tools.Calculator;

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
						System.out.println("0.Go Back, 1.Simple Calculator, 2.Coin Converter");
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
									
								/// Coin Converter
								case 2:
								{
									break;
								}
								case 3:
								{
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
