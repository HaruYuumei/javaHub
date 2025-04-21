package tools;


///
///
///	"The world is cruel, but also very beautiful."
/// 
///


enum exchange{
	
	Euro,Real,Dolar,Yen;
	
}

public class CoinConverter {
	
	private double money;
	private double euro = 6.5;
	private double dolar = 5.8;
	private double yen = 0.05;
	
	 public void euroConverter(double value) {
		 
		 setMoney(value);
		 double result = getMoney() * euro;
		 System.out.printf("The value of: %.2f  Euros in Reais is: R$: %.2f \n",money,result);
	 }
	 
	 public void dolarConverter(double value) {
		 setMoney(value);
		 double result = getMoney() * dolar;
		 System.out.printf("The value of: %.2f Dolars in Reais is: R$:%.2f \n",money,result);
	 }
	 
	 public void yenConverter(double value) {
		 setMoney(value);
		 double result = getMoney() * yen;
		 System.out.printf("The value of: %.2f Yens in Reais is: R$:%.2f \n",money,result);
	 }

	
	 void setMoney(double newMoney) {
		 money = newMoney;
	 }
	 double getMoney() {
		 return money;
	 }
	
}
