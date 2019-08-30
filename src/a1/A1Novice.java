package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tolCus = scan.nextInt();
		
		String firstName = "";
		String lastName = "";
		int quantity = 0;
		String itemName = "";
		double price = 0;
		int tolItems = 0;
		
		for (int i = 0; i < tolCus; i++) {
			firstName = scan.next();
			lastName = scan.next();
			
			tolItems = scan.nextInt();
			double[] totals = new double[tolItems];
			
			for (int j = 0; j < tolItems; j++) {
				quantity = scan.nextInt();
				itemName = scan.next();
				price = scan.nextDouble();
				totals[j] = quantity * price;
			}
			
			double f = calculateTotal(totals);
			
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", f));
			
		}
	}
	
	static double calculateTotal(double [] totals) {
		double total = 0;
		for (int i = 0; i < totals.length; i++) {
			total+= totals[i];
		}
		return total;
	}
}