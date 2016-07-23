package day_08.watki;

public class Balance {
	
	private int number = 0;
	
	synchronized public int balance() {
		number++;
		number--;
		
		return number;
	}

}
