package a1;

import java.util.Scanner;

public class A1Jedi {

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
		
		int[] total = new int[count];
		int[] numOfCus = new int[count];
		
		for (int j = 0; j < cusCount; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			
			int itemCount = scan.nextInt();
			
			int[] quantity = new int[itemCount];
			String[] itemName = new String[itemCount];
			
			for (int e = 0; e < itemCount; e++) {
				quantity[e] = scan.nextInt();
				itemName[e] = scan.next();
				
				for (int z = 0; z < count; z++) {
					for (int m = 0; m < itemName.length; m++) {
						if (name[z].equals(itemName[m])) {
							total[z]+= quantity[m];
							numOfCus[z]+= 1;
							break;
						}
					}
					
				}
			}
		}
		for (int k = 0; k < count; k++) {
			if (total[k] == 0) {
				System.out.println("No customers bought " + name[k]);
			} else {
				System.out.println(numOfCus[k] + " customers bought " + total[k] + " " + name[k]);
			}
		}
	}
}
