package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tolCus = scan.nextInt();
		
		String[] firstName = new String[tolCus];
		String[] lastName = new String[tolCus];
		
		for (int i = 0; i < firstName.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			
			int tolItems = scan.nextInt();
			
			int[] quantity = new int[tolItems];
			String[] itemName = new String[tolItems];
			double[] price = new double[tolItems];
			
			for (int j = 0; i < quantity.length; j++) {
				quantity[i] = scan.nextInt();
				itemName[i] = scan.next();
				price[i] = scan.nextDouble();
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
