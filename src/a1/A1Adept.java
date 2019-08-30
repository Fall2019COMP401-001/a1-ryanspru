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
			String[] itemName = new String[itemCount];
			
			for (int e = 0; e < itemCount; e++) {
				quantity[e] = scan.nextInt();
				itemName[e] = scan.next();
				
			}
		}
		
		if itemName.equals()
		

		// Your code follows here.
		
	}
	
}
