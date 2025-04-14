package tools;


///
///
///
/// "Run, run, lost boy, they say to me
/// Away from all of reality
/// Neverland is home to lost boys like me
/// And lost boys like me are free"
///
///
///



import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<Double> numbers = new ArrayList<Double>();
	
	
	public void addValue(double newValue) {
		numbers.add(newValue);
	}
	public Double getLastValue()
	{
		return numbers.getLast();
	}
	
	public void setNumber(double number)
	{
		try {
			addValue(number);	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(numbers.size() <= 0)
		{
			System.out.println("First Number: " + getLastValue());
		}
		else
		{
			System.out.println("Next Number: " + getLastValue());
		}
	}
	
	
	public void add()
	{
			
		if(numbers.size() > 0)
		{
			double result = 0;
			
			for(double numbers : numbers)
			{
				result = result + numbers;
			}
			
			
			for(double numbers : numbers)
			{
				System.out.printf(numbers+" + ");	
			}
			System.out.printf(" = "+result+"\n");
			numbers.removeAll(numbers);
		}
		else
		{
			System.out.println("Can't perform aditions to single number.");
		}
		
	}
	public void minus()
	{
		if(numbers.size() > 0)
		{
			double result = numbers.getFirst();
			
			for(int i =1;i<numbers.size();i++)
			{
				result -= numbers.get(i);
			}
			for(double numbers : numbers)
			{
				System.out.printf(numbers+" - ");	
			}
			System.out.printf(" = "+result+"\n");
			numbers.removeAll(numbers);
		}
		else
		{
			System.out.println("Can't perform aditions to single number.");
		}
		
	}
	public void divide()
	{
		if(numbers.size()>0) 
		{
			if(numbers.getLast() != 0 )
			{
				double result = numbers.get(0) / numbers.get(1);
				System.out.println(numbers.get(0)+" / "+numbers.get(1)+ " = "+result);
				numbers.removeAll(numbers);
			}
			else
			{
				throw new RuntimeException("Impossible to divide by 0");
			}
			
			
		}
		
	}
	public void multiply()
	{
			
		if(numbers.size()>0)
		{
			double result;
			
			if(numbers.getLast() == 0 || numbers.get(0) == 0)
			{
				result = 0;
				System.out.println("Anything multiplied by 0 is 0 Goshujin-Sama");
				numbers.removeAll(numbers);
			}
			result = numbers.get(0) * numbers.get(1);
			System.out.println(numbers.get(0)+" * "+numbers.get(1)+" = "+result);
			numbers.removeAll(numbers);
		}
	}
	
	
	
}
