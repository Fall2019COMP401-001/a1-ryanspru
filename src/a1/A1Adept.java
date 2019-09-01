package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		String[] name = new String[count];
		double[] price = new double[count];
		
		for (int i = 0; i < count; i++) {
			name[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int cusCount = scan.nextInt();
		
		String[] firstName = new String[cusCount];
		String[] lastName = new String[cusCount];
		
		for (int j = 0; j < cusCount; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			
			int itemCount = scan.nextInt();
			
			int[] quantity = new int[itemCount];
			String itemName = "";
			
			double[] total = new double[count];
			
			for (int e = 0; e < itemCount; e++) {
				quantity[e] = scan.nextInt();
				itemName = scan.next();
				
				for (int z = 0; z < count; z++) {
					if (name[z].equals(itemName)) {
						total[z]+= quantity * price[z];
					}
				}
			}
			cusTotal[j] = calculateTotal(total);
			double biggest = calculateBiggest(cusTotal);
			double smallest = calculateSmallest(cusTotal);
		}
		System.out.println("Biggest: " + firstName + " " + lastName + " (" + biggest + ")");
		System.out.println("Smallest: " + firstName + " " + lastName + " (" + smallest + ")");
		// Your code follows here.
	}
	static double calculateTotal(double[] total) {
		double totals = 0;
		for (int i = 0; i < total.length; i++) {
			totals+= total[i];
		}
		return totals;
	}
	
	static double calculateBiggest(double[] totals) {
		double biggest = 0;
		for (int j = 0; j < totals.length; j++) {
			if (totals[j] > biggest) {
				biggest = totals[j];
			}
		}
		return biggest;
	}
	
	static double calculateSmallest(double[] totals) {
		double smallest = 0;
		for (int f = 0; f < totals.length; f++) {
			if (totals[f] < smallest) {
				smallest = totals[f];
			}
		}
		return smallest;
	}
}
