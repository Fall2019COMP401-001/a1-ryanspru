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
		double[] cusTotal = new double[cusCount];
		
		double biggest = 0;
		double smallest = 99999999;
		String biggestFirstName = "";
		String biggestLastName = "";
		String smallestFirstName = "";
		String smallestLastName = "";
		
		for (int j = 0; j < cusCount; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			
			int itemCount = scan.nextInt();
			
			int quantity = 0;
			String itemName = "";
			
			double[] total = new double[count];
			
			for (int e = 0; e < itemCount; e++) {
				quantity = scan.nextInt();
				itemName = scan.next();
				
				for (int z = 0; z < count; z++) {
					if (name[z].equals(itemName)) {
						total[z]+= quantity * price[z];
					}
				}
			}
			cusTotal[j] = calculateTotal(total);
			
			for (int q = 0; q < cusTotal.length; q++) {
				if (cusTotal[q] > biggest) {
					biggest = cusTotal[q];
					biggestFirstName = firstName[q];
					biggestLastName = lastName[q];
				}
			}
			
			for (int w = 0; w < cusTotal.length; w++) {
				if (cusTotal[w] < smallest) {
					smallest = cusTotal[w];
					smallestFirstName = firstName[w];
					smallestLastName = lastName[w];
				}
			}
		}
		double average = 0;
		double n = 0;
		n = calculateTotal(cusTotal);
		average = n / cusCount;
		System.out.println("Biggest: " + biggestFirstName + " " + biggestLastName + " (" + String.format("%.2f", biggest) + ")");
		System.out.println("Smallest: " + smallestFirstName + " " + smallestLastName + " (" + String.format("%.2f", smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		// Your code follows here.
	}
	static double calculateTotal(double[] total) {
		double totals = 0;
		for (int i = 0; i < total.length; i++) {
			totals+= total[i];
		}
		return totals;
	}
}
