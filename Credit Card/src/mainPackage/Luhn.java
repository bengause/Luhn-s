package mainPackage;

import java.util.Scanner;
public class Luhn {
	
	
	private int creditCardNumber;
	
	public Luhn(){
		
	}
	
	public int getCreditCardNumber(){
		return creditCardNumber;
	}

	public void setCreditCardNumber(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your 16 digit credit card number: ");
		creditCardNumber = (int)input.nextInt();
		input.close();
	}
	public boolean Luhns(int creditCardNumber){
		int sum = 0;
		for (double i = 15; i > 0; i--){
			double c = (double) i;
			int num = creditCardNumber % (int)(Math.pow(10.0, c));
			if (i % 2 == 1){
				num = num * 2;
			}
			if (num >= 10){
				num = 1 + num % 10;
				sum += num;
			}
			else{
				sum += num;
			}
		}
		if (sum % 10 == 0){
			return true;
		}
		else{
			return false;
		}
			
		
	}
	
}
