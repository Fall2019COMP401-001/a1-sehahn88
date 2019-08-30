package a1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt();
		DecimalFormat format = new DecimalFormat("##.00");
		
		String[] itemNames = new String[numItems];
		Double[] itemPrices = new Double[numItems];
		
		for (int i = 0; i < numItems; i++) {
			
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			
			itemNames[i] = itemName;
			itemPrices[i] = itemPrice;
			
		}
		
		System.out.println(itemNames);
		int numCustomers = scan.nextInt();
		
		String[] customerNames = new String[numCustomers];
		Double[] customerTotals = new Double[numCustomers];
		
		for (int i=0; i < numCustomers; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			int itemsPurchased = scan.nextInt();
			
			double total = 0.0;
			
			for (int j=0; j < itemsPurchased; j++) {
				
				int numPurchased = scan.nextInt();
				String itemPurchased = scan.next();
				
				total += numPurchased * itemPrices[index(itemNames, itemPurchased)];
				
			}
			
			customerNames[i] = firstName + ' ' + lastName;
			customerTotals[i] = total;
			
		}
		
		Double max = findMax(customerTotals);
		System.out.println("Biggest: " + customerNames[doubleIndex(customerTotals,max)] + " (" + format.format(max) + ')');
		
		Double min = findMin(customerTotals);
		System.out.println("Smallest: " + customerNames[doubleIndex(customerTotals,min)] + " (" + format.format(min) + ')');
		
		Double sum = sum(customerTotals);
		Double average = sum / numCustomers;
		System.out.println("Average: " + format.format(average));

		scan.close();
	}
	
	static int index(String[] array, String target) {
		
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
	
	static Double findMin(Double[] vals) {
		
		// Initialize current minimum to first value in array.
		Double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}
	
	static Double findMax(Double[] vals) {
		
		// Initialize current minimum to first value in array.
		Double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
	
	static Double sum(Double[] vals) {
		
		Double sum = 0.0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}

}
