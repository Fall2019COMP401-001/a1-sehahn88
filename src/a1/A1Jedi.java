package a1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt();
		
		String[] itemNames = new String[numItems];
		int[] numOfSpecificItems = new int[numItems];
		int[] numOfCustomersBought = new int[numItems];
		
		for (int i = 0; i < numItems; i++) {
			
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			
			itemNames[i] = itemName;
			
		}
		
		int numCustomers = scan.nextInt();
		
		for (int i=0; i < numCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsPurchased = scan.nextInt();
			
			ArrayList<String> placeholders = new ArrayList<String>();
			
			for (int j=0; j < itemsPurchased; j++) {
				
				int numPurchased = scan.nextInt();
				String itemPurchased = scan.next();
				
				
				numOfSpecificItems[stringIndex(itemNames, itemPurchased)] += numPurchased;
				
				if (!placeholders.contains(itemPurchased)) {
				placeholders.add(itemPurchased);
				numOfCustomersBought[stringIndex(itemNames, itemPurchased)] += 1;					
				}

			}
			
			
		}
		
		for (int i=0; i < numItems; i++) {
			
			if (numOfCustomersBought[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);	
			} else {
			System.out.println(numOfCustomersBought[i] + " customers bought " + 
							   numOfSpecificItems[i] + ' ' + itemNames[i]);
			}
			
		}
		


		scan.close();
		}
	
	static int stringIndex(String[] array, String target) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(target))
				return i;
		}
		return -1;
		
	}
	
	static int doubleIndex(Double[] array, Double target) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == (target))
				return i;
		}
		return -1;
		
	}
		
}

