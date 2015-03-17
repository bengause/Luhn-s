package mainPackage;

public class User {

	public static void main(String[] args) {
		
		Luhn ben = new Luhn();
		
		ben.setCreditCardNumber();
		
		System.out.println("The credit card number follows Luhn's rule: " +
		ben.Luhns(ben.getCreditCardNumber()));

	}

}
