package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tolCus = scan.nextInt();
		
		for (int i = 0; i < tolCus; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			
			int tolItems = scan.nextInt();
			
			for (int j = 0; j < tolItems; j++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double price = scan.nextDouble();
			}
			
			double total = calculateTotal(quantity, price, 0);
			
		}
		
		String firstInitial = findFirstInitial(firstName, 0);
		String lastNam = findLastNam(lastName, 0);

		// Your code follows here.
		
	}
	
	static String findFirstInitial(String[] firstNames, int a) {
		return firstNames[a][0];
	}
	
	static String findLastNam(String[] lastNames, int b) {
		return lastNames[b];
	}
	
	static double calulateTotal(int[] quantities, double[] prices, int c) {
		double total = 0;
		total = quantities[c] * prices[c];
		return total;
	}
}
