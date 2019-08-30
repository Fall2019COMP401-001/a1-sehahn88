package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		DecimalFormat format = new DecimalFormat("##.00");
		int totalCustomers = scan.nextInt();
		
		for (int i = 0; i < totalCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsPurchased = scan.nextInt();
			
			double Total = 0.0;
			
			for (int j = 0; j < itemsPurchased; j++) {
				
				int quantityOfItem = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				
				Total += quantityOfItem * price;
				
			}
			
			char firstInitial = firstName.charAt(0);
			
			System.out.println(firstInitial + ". " + lastName + ": " + format.format(Total));
			
		}
		
		scan.close();
		
	}
}
