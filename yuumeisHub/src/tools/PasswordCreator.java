package tools;

import java.util.Random;

public class PasswordCreator {

	String lowKey = "abcdefghijklmnopqrstuvxwyz";
	String upKey = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
	String specialKeys = "!@#$%¨&*()_+=.";
	String numberKeys = "0123456789";
	String completePassword = lowKey+upKey+specialKeys+numberKeys;
	String lettersnNumbers = lowKey+upKey+numberKeys;
	String letterOnly= lowKey + upKey;
	String NumberOnly = numberKeys;
	Random random = new Random();
	
	//complete
	public void generateCompletePassword(int lenght) {
		StringBuilder pass = new StringBuilder();
		
		for(int i = 0;i < lenght;i++)
		{
			int index = random.nextInt(completePassword.length());
			pass.append(completePassword.charAt(index));		
		}
		
		System.out.println("Your new Password Goshujin-Sama: " + pass);
		pass.setLength(0);
	}
	
	//letters+numbers
	public void generateLNPassword(int lenght) {
		StringBuilder newPass = new StringBuilder();
		for(int i = 0;i < lenght;i++)
		{
			int index = random.nextInt(lettersnNumbers.length());
			newPass.append(lettersnNumbers.charAt(index));		
		}
		
		System.out.println("Your new Password Goshujin-Sama: " + newPass);
		newPass.setLength(0);
	}
	
	//only letters
	public void generateLPassword(int lenght) {
		StringBuilder newPass = new StringBuilder();
		for(int i = 0;i < lenght;i++)
		{
			int index = random.nextInt(letterOnly.length());
			newPass.append(letterOnly.charAt(index));		
		}
		
		System.out.println("Your new Password Goshujin-Sama: " + newPass);
		newPass.setLength(0);
	}
	public void generateNPassword(int lenght) {
		StringBuilder newPass = new StringBuilder();
		for(int i = 0;i < lenght;i++)
		{
			int index = random.nextInt(NumberOnly.length());
			newPass.append(NumberOnly.charAt(index));		
		}
		
		System.out.println("Your new Password Goshujin-Sama: " + newPass);
		newPass.setLength(0);
	}
	
}
