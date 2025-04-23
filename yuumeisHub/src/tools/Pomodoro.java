package tools;

public class Pomodoro {	
	
	public void startCounting(int min) throws InterruptedException{
		System.out.println("Setting study session of: "+ min + " Minutes");
		for (int i = min; i > 0; i--) {
			System.out.println("Study session: "+ i + " Minutes" + "\r");
			Thread.sleep(60_000);
		}
		System.out.println("Goshujin-sama, time is up! Otsukare~ Now you may rest please");
	}
	
}
